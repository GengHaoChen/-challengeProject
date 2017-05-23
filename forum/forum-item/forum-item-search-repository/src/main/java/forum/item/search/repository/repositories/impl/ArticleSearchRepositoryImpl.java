package forum.item.search.repository.repositories.impl;

import com.google.gson.Gson;
import forum.item.search.repository.documents.ArticleDocument;
import forum.item.search.repository.repositories.ArticleSearchRepository;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleSearchRepositoryImpl implements ArticleSearchRepository {

    @Autowired
    public ArticleSearchRepositoryImpl(TransportClient transportClient) {
        this.transportClient = transportClient;
    }

    @Override
    public void createArticle(ArticleDocument articleDocument) {
        Gson gson = new Gson();
        String document = gson.toJson(articleDocument);
        transportClient.prepareIndex("articles", "article").setSource(document);
    }


    private TransportClient transportClient;

}
