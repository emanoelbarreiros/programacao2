package su;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class GeradorTOC {
	
	public static void main(String[] args) {
		LedorDados l = new LedorDados();
		StringBuffer toc = new StringBuffer();
		try {
			HashMap<String, Artigo> dados = l.lerDadosArtigos();
			ArrayList<Ordem> ordens = l.lerOrdem();
			
			Ordem ordem = null;
			String categoriaAnterior = "";
			String areaAnterior = "";
			int paginaAtual = 1;
			for (int i = 0; i < ordens.size(); i++) {
				ordem = ordens.get(i);
				
				if (!ordem.categoria.equals(categoriaAnterior)) {//mudou a categoria, criar nova categoria no TOC
					toc.append("\n");
					toc.append(String.format("\\noindent \\textsc{\\textbf{\\Large %s}}\\\\ \n", formatar(ordem.categoria)));
					toc.append("\\hrule \n");					
					toc.append("\n");
					
					categoriaAnterior = ordem.categoria;
				}
				
				if (!ordem.area.equals(areaAnterior)) {
					toc.append("\n");
					toc.append(String.format("\\noindent \\textsc{\\textbf{%s}}\\\\ \n", formatar(ordem.area)));
					toc.append("\n");
					
					areaAnterior = ordem.area;
				}
				
				toc.append("\n");
				toc.append(String.format("\\noindent \\textsc{\\hyperlink{%s.1}{%s}}\\\\ \n", ordem.caminhoCompleto, dados.get(ordem.arquivo).titulo.toUpperCase()));
				toc.append(String.format("\\noindent \\textsc{\\textit{%s}} \\hfill %d\\\\ \n", dados.get(ordem.arquivo).autores.replace(" and ", " e "), paginaAtual));
				paginaAtual += ordem.qtdPaginas;
			}
			
			System.out.println(toc.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String formatar(String valor) {
		String retorno = "ERRO";
		if (valor.equals("estagio")) {
			retorno = "Estágio Curricular Supervisionado";
		} else if (valor.equals("extensao")) {
			retorno = "Extensão";
		} else if (valor.equals("ic")) {
			retorno = "Iniciação Científica";
		} else if (valor.equals("monitoria")) {
			retorno = "Monitoria";
		} else if (valor.equals("pesquisa")) {
			retorno = "Pesquisa";
		} else if (valor.equals("pibid")) {
			retorno = "PIBID";
		} else if (valor.equals("biologia")) {
			retorno = "Ciências Biológicas";
		} else if (valor.equals("computacao")) {
			retorno = "Computação";
		} else if (valor.equals("geografia")) {
			retorno = "Geografia";
		} else if (valor.equals("matematica")) {
			retorno = "Matemática";
		} else if (valor.equals("psicologia")) {
			retorno = "Psicologia";
		} else if (valor.equals("historia")) {
			retorno = "História";
		} else if (valor.equals("medicina")) {
			retorno = "Medicina";
		} else if (valor.equals("pedagogia")) {
			retorno = "Pedagogia";
		} else if (valor.equals("letras")) {
			retorno = "Letras";
		} 
		
		return retorno;
	}

}