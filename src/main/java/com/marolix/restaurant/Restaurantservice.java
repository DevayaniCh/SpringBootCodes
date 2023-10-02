package com.marolix.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "restaurantService")
public class Restaurantservice {
	     @Autowired
		private RestaurantRepo restaurantRepo;

		public String insertEntity(RestaurantEntity entity) {
			restaurantRepo.save(entity);
			return "inserted Succesfully";
		}
		
		public RestaurantEntity readEntity(RestaurantEntity entity) {
			Optional<RestaurantEntity> optional = restaurantRepo.findById(entity.getId());
			if (optional.isPresent())
				return optional.get();
			else
				return null;
		}
		public RestaurantEntity updateEntity(String user_Name, String mobileNumber, Integer id, String restaurantname,
	            String reservationStatus) {
			Optional<RestaurantEntity> optional = restaurantRepo.findById(id);
			if (optional.isPresent()) {
				RestaurantEntity dm = optional.get();
				dm.setUser_Name(user_Name);
				restaurantRepo.save(dm);
				return dm;
			} else
				throw new RuntimeException("no entity found with id " + id);
		}

		public void deleteEntity(Integer id) 
		{
//			demoRepo.deleteById(id);
			Optional<RestaurantEntity> dm = restaurantRepo.findById(id);
			// Supplier
			RestaurantEntity e = dm.orElseThrow(() -> new RuntimeException("no entity found with id " + id));
			restaurantRepo.delete(e);
			System.out.println("deleted successfully");
		}

		public List<RestaurantEntity> readAllEntities() {
			Iterable<RestaurantEntity> itr = restaurantRepo.findAll();
			List<RestaurantEntity> l = new ArrayList<RestaurantEntity>();
			for (RestaurantEntity i : itr) {
				l.add(i);
			}
			return l;
		}

		public List<RestaurantEntity> readAll(Set<Integer> s) {

			Iterable<RestaurantEntity> itr = restaurantRepo.findAllById(s);
			List<RestaurantEntity> l = new ArrayList<RestaurantEntity>();
			for (RestaurantEntity i : itr) {
				l.add(i);
			}
			return l;

		}
		public void deleteAll() {
			restaurantRepo.deleteAll();
			System.out.println("deleted all enties");
		}
	}


