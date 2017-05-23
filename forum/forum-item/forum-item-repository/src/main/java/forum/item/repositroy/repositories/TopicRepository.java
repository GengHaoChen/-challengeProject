package forum.item.repositroy.repositories;

import cn.geng.foundation.core.interfaces.repositories.BaseRepository;
import forum.item.repositroy.model.Topic;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends BaseRepository<Topic, String> {
}
