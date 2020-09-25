package communitymanagement.dao;

import communitymanagement.model.StaffCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StaffCategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<StaffCategory> getAllStaffCategory() {
        List<StaffCategory> staffCategories = new ArrayList<>();

        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<StaffCategory> criteriaQuery = criteriaBuilder.createQuery(StaffCategory.class);
            Root<StaffCategory> root = criteriaQuery.from(StaffCategory.class);
            criteriaQuery.select(root);
            staffCategories = session.createQuery(criteriaQuery).getResultList();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return staffCategories;
    }
}