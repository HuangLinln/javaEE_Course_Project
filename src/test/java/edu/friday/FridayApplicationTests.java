package edu.friday;

import edu.friday.model.SysUser;
import edu.friday.repository.SysUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
class FridayApplicationTests {
    @Autowired
    SysUserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Transactional
    @Test
    void testSaveUser(){
        SysUser user = new SysUser();
        user.setUserName("Alex");
        user.setNickName("alex test");
        userRepository.save(user);
    }

    @Test
    void testUpdateUser(){
        SysUser user = userRepository.getOne(new Long(110));
        user.setUserName("Alex 1");
        user.setNickName("alex test");
        userRepository.save(user);
    }

    @Test
    void testFindUsers(){
        System.out.println(userRepository.findAll());
    }

    @Test
    void testDeleteUser() {
        userRepository.deleteById(new Long(110));
    }

}
