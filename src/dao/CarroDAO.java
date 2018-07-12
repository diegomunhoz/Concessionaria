package dao;

import dao.GenericDAO;
import util.HibernateUtil;
import java.util.ArrayList;
import model.Carro;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CarroDAO extends GenericDAO{
	
	public Carro buscarPorCodigo (int codigo) throws Exception{
		Session sessao = null;
		Carro carro = null;

		sessao = HibernateUtil.getSessionFactory().openSession();
		carro = (Carro) sessao.get(Carro.class, codigo);

		return carro;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Carro> buscarTodos() throws Exception{
		ArrayList<Carro> listaRetorno = new ArrayList<Carro>();
		
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		
		Criteria criteria = sessao.createCriteria(Carro.class);
		
		criteria.addOrder (Order.asc("codigo"));
		
		listaRetorno = (ArrayList<Carro>) criteria.list();
		
		return listaRetorno;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Carro> pesquisarPorModelo(String modelo) throws Exception{
		ArrayList<Carro> listaRetorno = new ArrayList<Carro>();
		
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		
		Criteria criteria = sessao.createCriteria(Carro.class);

		criteria.add(Restrictions.ilike("modelo", "%" + modelo + "%"));

		criteria.addOrder(Order.asc("modelo"));
		
		listaRetorno = (ArrayList<Carro>) criteria.list();
		
		return listaRetorno;
	}
}