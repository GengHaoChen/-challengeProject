package forum.item.repositroy.repositories;

import cn.geng.foundation.core.interfaces.repositories.BaseRepository;
import forum.item.repositroy.model.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends BaseRepository<Article, String> {
}
