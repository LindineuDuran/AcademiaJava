/**
 *
 */
package br.com.lduran.generics;

import java.util.Collection;

/**
 * @author lsdur
 *
 */
public interface IDataAccessObject<Entidade, PrimaryKey>
{
	public void save(Entidade e);

	public void delete(Entidade e);

	public Collection<Entidade> readAll();

	public Collection<Entidade> readyByPK(PrimaryKey key);
}
