package su;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.pdfbox.pdmodel.PDDocument;

public class LedorDados {
	
	public HashMap<String, Artigo> lerDadosArtigos() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("/Users/emanoel/Documents/workspace-aulas/programacao2/src/su/dados.txt"));
		
		HashMap<String, Artigo> retorno = new HashMap<String, Artigo>();
		
		String linha = reader.readLine(); 
		while(linha != null) {
			String[] tokens = linha.split("\t");
			
			Artigo a = new Artigo();
			a.numero = tokens[0];
			a.autores = tokens[1];
			a.titulo = tokens[2];
			a.arquivo = tokens[4];
			
			retorno.put(a.arquivo, a);
			
			linha = reader.readLine();
		}
		
		return retorno;
	}
	
	public ArrayList<Ordem> lerOrdem() throws IOException {
		String prefixo = "/Users/emanoel/Google Drive/UPE/Extensão/SUGUS 2016/anais/";
		BufferedReader reader = new BufferedReader(new FileReader("/Users/emanoel/Documents/workspace-aulas/programacao2/src/su/ordemartigos.txt"));
		PDDocument pdf;
		ArrayList<Ordem> retorno = new ArrayList<Ordem>();
		
		String linha = reader.readLine(); 
		while(linha != null) {
			String[] tokens = linha.split("/");
			
			Ordem o = new Ordem();
			o.categoria = tokens[0];
			o.area = tokens[1];
			o.arquivo = tokens[2];
			o.caminhoCompleto = linha;
			
			pdf = PDDocument.load(new File(prefixo + linha));
			o.qtdPaginas = pdf.getNumberOfPages();
			pdf.close();
			
			retorno.add(o);
			
			linha = reader.readLine();
		}
		
		return retorno;
	}

}

