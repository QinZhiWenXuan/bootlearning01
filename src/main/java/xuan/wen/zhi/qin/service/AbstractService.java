package xuan.wen.zhi.qin.service;

import org.springframework.transaction.annotation.Transactional;
import xuan.wen.zhi.qin.domain.repository.BasicRepository;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by qinzhiwenxuan on 2017/4/20.
 */
@Transactional
public abstract class AbstractService<T> implements BasicService<T> {
    protected BasicRepository<T> basicRepository;

    /***
     * 注入Repository
     */
    public abstract void injectionRepository();

    /***
     * 初始化
     */
    @PostConstruct
    private void init () {
        this.injectionRepository();
    }

    /***
     * 获取所有的对象
     *
     * @return 结果集
     */
    @Override
    public List<T> all() {
        return this.basicRepository.all();
    }

    /***
     * 保存对象
     *
     * @param model 对象
     * @return true : 成功 | false : 失败
     */
    @Override
    public boolean save(T model) {
        int result = this.basicRepository.save(model);
        return (result > 0);
    }

    /***
     * 编辑对象
     *
     * @param model 参数
     * @return true : 成功 | false : 失败
     */
    @Override
    public boolean edit(T model) {
        int result = this.basicRepository.edit(model);
        return (result > 0);
    }

    /***
     * 根据ID获取对象
     *
     * @param id id 主键
     * @return 用户
     */
    @Override
    public T getById(Integer id) {
        return this.basicRepository.queryById(id) ;
    }

    /***
     * 删除
     *
     * @param id id 主键
     * @return true : 成功 | false : 失败
     */
    @Override
    public boolean deleteById(Integer id) {
        int result = this.basicRepository.deleteById(id) ;
        return (result > 0);
    }
}
