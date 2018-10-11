package com.fatec.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.sce.model.Livro;

public class UC01CadastrarLivro {

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT02CadastrarLivroCom_isbn_branco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	@Test
	public void CT03CadastrarLivroCom_isbn_nulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn(null);
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	@Test
	public void CT04CadastrarLivroCom_Titulo_branco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("1111");
			umLivro.setTitulo("");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
	}
	@Test
	public void CT05CadastrarLivro_com_dados_validos() {
		
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("1111");
			umLivro.setTitulo("Eng Software");
			umLivro.setAutor("Pressman");
		
			// verificacao
			assertEquals("1111",umLivro.getIsbn());		
	}
}
