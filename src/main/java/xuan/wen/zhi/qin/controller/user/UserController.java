package xuan.wen.zhi.qin.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import xuan.wen.zhi.qin.domain.model.user.UserModel;
import xuan.wen.zhi.qin.service.user.UserService;

import java.util.List;

/**
 * Created by qinzhiwenxuan on 2017/4/20.
 */
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@ResponseBody
public class UserController {
    @Autowired
    private UserService<UserModel> userService;

    /***
     * 获取所有的用户
     *
     * @return 结果集
     */
    @RequestMapping(method = {RequestMethod.GET})
    public List<UserModel> users() {
        return userService.all();
    }

    /***
     * 根据ID获取用户
     *
     * @param id id 主键
     * @return 用户
     */
    @RequestMapping(value = "/{id}", method = {RequestMethod.GET})
    public UserModel user(@PathVariable(name = "id") Integer id) {
        return userService.getById(id);
    }

    /***
     * 保存
     *
     * @param model 保存参数
     * @return 结果
     */
    @RequestMapping(method = {RequestMethod.POST})
    public String save(UserModel model) {
        userService.save(model);
        return "success";
    }

    /***
     * 编辑
     *
     * @param model 编辑参数
     * @return 结果
     */
    @RequestMapping(method = {RequestMethod.PUT})
    public String edit(UserModel model) {
        userService.edit(model);
        return "success";
    }

    /***
     * 删除
     *
     * @param id id 主键
     * @return 结果
     */
    @RequestMapping(value = "/{id}" ,method = {RequestMethod.DELETE})
    public String delete(@PathVariable(name = "id") Integer id) {
        userService.deleteById(id);
        return "success";
    }
}
