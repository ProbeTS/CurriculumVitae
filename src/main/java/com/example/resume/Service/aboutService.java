package com.example.resume.Service;

import com.example.resume.Category.About;
import com.example.resume.Dao.aboutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class aboutService {
    @Autowired
    private aboutDao aboutDao;

    /**
     * 查找所有用户
     */
    public List<About> selectAllAbout() {
        return aboutDao.findAllAbout();
    }

}
