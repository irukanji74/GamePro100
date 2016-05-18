package com.hackday.services;

import java.util.List;

import com.hackday.dao.LessonsDao;
import com.hackday.entity.LessonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class LessonsService {

    @Autowired
    private LessonsDao dao;

    public boolean create(LessonEntity lessonEntity) {
        dao.create(lessonEntity);
        return true;
    }

    public List<LessonEntity> getList() {
        return dao.getList();
    }

    public void delete(LessonEntity lessonEntity) {
        dao.delete(lessonEntity);
    }

    public LessonEntity get(Long id) {
        return dao.get(id);
    }

    public void update(LessonEntity lessonEntity){
        dao.update(lessonEntity);
    }
}