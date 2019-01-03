package org.shieldproject.skynet.crawler.provider.repository;

import org.shieldproject.skynet.crawler.provider.bean.Category;
import org.shieldproject.skynet.crawler.provider.bean.Mall;
import org.shieldproject.skynet.crawler.provider.bean.MallCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {
    @Autowired
    MongoTemplate mongoTemplate;
    public void saveCategory(Category category) {
        mongoTemplate.save(category);
    }

    public Category findCategoryById(String id) {
        return mongoTemplate.findOne(Query.query(Criteria.where("id").is(id)), Category.class);
    }

    public void saveMall(Mall mall) {
        mongoTemplate.save(mall);
    }

    public void saveMallCategory(MallCategory mallCategory) {
        mongoTemplate.save(mallCategory);
    }


}