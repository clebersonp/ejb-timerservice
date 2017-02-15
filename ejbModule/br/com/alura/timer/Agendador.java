package br.com.alura.timer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {

	@Schedule(hour = "*", minute = "*/2", second = "0", persistent = false)
	public void agendado() {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		
		System.out.println("[AGENDAMENTO] Verificando serviço externo periodicamente. " + format.format(Calendar.getInstance().getTime()));
	}
	
}
