package spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.entities.Laptop;

@Repository
public class LaptopDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int add(Laptop laptop) {
		int save = (Integer) hibernateTemplate.save(laptop);
		return save;
	}

	@Transactional
	public void update(Laptop laptop) {
		hibernateTemplate.update(laptop);
	}

	@Transactional
	public void delete(int id) {
		hibernateTemplate.delete(hibernateTemplate.get(Laptop.class, id));
	}

	public Laptop get(int id) {
		Laptop laptop = hibernateTemplate.get(Laptop.class, id);
		return laptop;
	}

	public List<Laptop> getAll() {
		List<Laptop> list = hibernateTemplate.loadAll(Laptop.class);
		return list;
	}

}
