package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		
		//estabelecendo fluxo de entrada com um arquivo, al�m de trata a exce��o adicionando um Throw
		//FileInputStream somente l� os bytes
		InputStream fis = new FileInputStream("lorem.txt");
		//transformar os bytes em caracteres
		Reader isr = new InputStreamReader(fis, "UTF-8");
		//poder ler a linha inteira do arquivo
		BufferedReader br = new BufferedReader(isr);
		
		//ler o arquivo com o m�todo readLine() e guardando em uma vari�vel, no caso String.
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		//fechando o BufferedReader
		br.close();
		
	}

}
