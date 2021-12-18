/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 */
package br.com.globalcode.aj4.gui.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosMouseListener implements MouseListener
{

	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		System.out.println("[EventosMouseListener] mouse clicked");
	}

	@Override
	public void mousePressed(MouseEvent evento)
	{
		System.out.println("[EventosMouseListener] mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent evento)
	{
		System.out.println("[EventosMouseListener] mouse released");
	}

	@Override
	public void mouseEntered(MouseEvent evento)
	{
		System.out.println("[EventosMouseListener] mouse entered");
	}

	@Override
	public void mouseExited(MouseEvent evento)
	{
		System.out.println("[EventosMouseListener] mouse exited");
	}
}