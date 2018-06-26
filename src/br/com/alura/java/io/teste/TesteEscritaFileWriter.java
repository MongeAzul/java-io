package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaFileWriter {
	
	public static void main(String[] args) throws IOException {
		
		long ini = System.currentTimeMillis();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Abc abc");
		bw.newLine();
		bw.write("toda criança vai ler e escrever");
		
		bw.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram " + (fim - ini) + " millisegundos");
		
	}

}
