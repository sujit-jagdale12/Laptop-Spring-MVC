package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.LaptopDao;
import spring.entities.Laptop;

@Service
public class LaptopService {

	@Autowired
	private LaptopDao laptopDao;

	public int addLaptop(Laptop laptop) {
		return laptopDao.add(laptop);
	}

	public void updateLaptop(Laptop laptop) {
		laptopDao.update(laptop);
	}

	public void deleteLaptop(int id) {
		laptopDao.delete(id);
	}

	public Laptop getLaptop(int id) {
		Laptop laptop = laptopDao.get(id);
		return laptop;
	}

	public List<Laptop> getAllLaptops() {
		List<Laptop> laptops = laptopDao.getAll();
		return laptops;
	}

}
