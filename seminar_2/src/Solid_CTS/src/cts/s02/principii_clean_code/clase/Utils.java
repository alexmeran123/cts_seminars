package Solid_CTS.src.cts.s02.principii_clean_code.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

//	public static List<Student> readStudents(String file) throws FileNotFoundException, NumberFormatException {
//		Scanner input = new Scanner(new File(file));
//		input.useDelimiter(",|\n");
//		List<Student> studenti = new ArrayList<Student>();
//
//		while (input.hasNext()) {
//			String nume = input.next();
//			String prenume = (input.next()).toString();
//			int varsta = Integer.valueOf(input.nextInt());
//			int punctaj = Integer.valueOf(input.nextInt());
//			int nr = Integer.valueOf(input.nextInt());
//			String[] vect = new String[5];
//			for (int i = 0; i < nr; i++)
//				vect[i] = input.next();
//			int an_studii = input.nextInt();
//			String facultate = (input.next()).toString();
//			Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
//			studenti.add(s);
//		}
//		input.close();
//		return studenti;
//	}
//
//	public static List<Angajat> readAngajati(String file) throws FileNotFoundException {
//		return null;
//	}
//
//	public static List<Elev> readPupil(String file) throws FileNotFoundException {
//		return null;
//	}

//	public static void readAll() {
//		List<Elev> listaelevi;
//		List<Student> listastudenti;
//		List<Angajat> listaangajati;
//
//		try {
//			System.out.println("aasdasdasdas =>>>>>>>>>>.");
//
//			listaelevi = Utils.readPupil("elevi.txt");
//
//			for (int i = 0; i < listaelevi.size(); i++)
//				System.out.println(listaelevi.get(i).toString());
//
//			listastudenti = Utils.readStudents("studenti.txt");
//			for (int i = 0; i < listastudenti.size(); i++)
//				System.out.println(listastudenti.get(i).toString());
//
//			listaangajati = Utils.readAngajati("angajati.txt");
//			for (int i = 0; i < listaangajati.size(); i++)
//				System.out.println(listaangajati.get(i).toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}