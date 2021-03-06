package com.smartplan; 



public class Timetable {
	
//	Feld zur Verwaltung aller F�cher der Woche
	static Subject [][] field; 
	int daynr; 
	int hournr; 
	
	public Timetable(){
		daynr = 5;
		hournr = 12; 
		field = new Subject [daynr][hournr];
	}
	
//	�ndert den Speicherplatz im angegebenen Feld auf das angegebe Fach
	public static void changeSubject(Subject newSubject, int x, int y){
		field[x][y] = newSubject; 
	}
	
//	Gibt die ersten drei Buchstaben des Faches wieder; diese k�nnen dann z.B. in die Buttons der MainActivity eingetragen werden
	public static String substrSubject(int x, int y){
		
		Subject subject = field[x][y];
		String subjectName = subject.getSubject();
		
		return subjectName.substring(0,3); 
	}
	
//	
//	public String getTeacherBySubject(String searchsubject){
//		String searchteacher = null; 
//		
//		for (int i = 0; i < daynr; i++){
//			for (int j = 0; j < hournr; j++){
//				String subject = field[i][j].getSubject(); 
//				if (subject.compareToIgnoreCase(searchsubject) == 0){
//					searchteacher = field[i][j].getTeacher(); 
//					break; 
//				}	
//			}
//		}
//		
//		return searchteacher; 
//	}
	
}
