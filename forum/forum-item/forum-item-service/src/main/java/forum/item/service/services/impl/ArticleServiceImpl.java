package forum.item.service.services.impl;

import cn.geng.foundation.core.models.Pager;
import forum.item.repositroy.repositories.ArticleRepository;
import forum.item.search.repository.repositories.ArticleSearchRepository;
import forum.item.service.models.ArticleModel;
import forum.item.service.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    public ArticleServiceImpl(ArticleSearchRepository articleSearchRepository, ArticleRepository articleRepository) {
        this.articleSearchRepository = articleSearchRepository;
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleModel save(ArticleModel articleModel) {
        return null;
    }

    @Override
    public ArticleModel findOne(String s) {
        return null;
    }

    @Override
    public List<ArticleModel> findAll(ArticleModel articleModel) {
        return null;
    }

    @Override
    public List<ArticleModel> findAll(ArticleModel articleModel, Pager pager) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String s) {

    }

    private ArticleSearchRepository articleSearchRepository;

    private ArticleRepository articleRepository;
}
