package xuan.wen.zhi.qin.domain.repository.user;

import org.springframework.stereotype.Repository;
import xuan.wen.zhi.qin.domain.model.user.UserModel;
import xuan.wen.zhi.qin.domain.repository.BasicRepository;

/**
 * Created by qinzhiwenxuan on 2017/4/20.
 */
@Repository("userRepository")
public interface UserRepository extends BasicRepository<UserModel> {

}
