package br.com.lduran.aj4.annotations;

import java.lang.reflect.Field;

import javax.swing.*;

public class GUIGenerator extends JPanel
{
	public static final int STEP_H = 20;
	private String className;
	private int lastWidth = 10;
	private int lastHeight = 10;

	/**
	 *
	 */
	public GUIGenerator()
	{
		this.setLayout(null);
	}

	/**
	 * @return the className
	 */
	public String getClassName()
	{
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className)
	{
		this.className = className;

		// chamada ao método que interpreta as anotações da classe
		loadClass();
	}

	private void loadClass()
	{
		Class classe = null;

		try
		{
			// Carregamento da classe
			classe = Class.forName(className);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		// Obtenção dos atributos da classe
		Field fields[] = classe.getDeclaredFields();

		for (Field field : fields)
		{
			if (field.isAnnotationPresent(GUIVisible.class))
			{
				// após identificação da anotação, chamada para construir o componente de campo de texto na tela.
				buildGUIField(field);
			}
		}
	}

	public void bind(Object entidade)
	{
		if (getClassName() == null)
		{
			setClassName(entidade.getClass().getName());
		}
	}

	private void buildGUIField(Field field)
	{
		GUIVisible anotacao = field.getAnnotation(GUIVisible.class);
		String nomeDoCampo = anotacao.nomeCampo();
		JLabel label1 = new JLabel(nomeDoCampo);
		JTextField text1 = new JTextField("");

		label1.setBounds(lastWidth, lastHeight, 200, 15);
		lastHeight += STEP_H;

		text1.setBounds(lastWidth, lastHeight, 200, 15);
		lastHeight += STEP_H;

		this.add(label1);
		this.add(text1);
	}
}
