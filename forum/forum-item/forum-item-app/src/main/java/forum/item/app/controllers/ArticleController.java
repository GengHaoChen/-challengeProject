package forum.item.app.controllers;

import forum.item.app.models.ItemArticle;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {
    @RequestMapping(value = "{topicId}", method = RequestMethod.GET)
    public List<ItemArticle> getArticles(@PathVariable Long topicId) {

        List<ItemArticle> itemArticles = new ArrayList<ItemArticle>();
        ItemArticle itemArticle1 = new ItemArticle();
        itemArticle1.setArticleId(1L);
        itemArticle1.setItemTopicId(topicId);
        itemArticle1.setArticleTopic("articleTopic1");
        itemArticles.add(itemArticle1);

        ItemArticle itemArticle2 = new ItemArticle();
        itemArticle2.setArticleId(2L);
        itemArticle2.setItemTopicId(topicId);
        itemArticle2.setArticleTopic("articleTopic2");
        itemArticles.add(itemArticle2);

        ItemArticle itemArticle3 = new ItemArticle();
        itemArticle3.setArticleId(3L);
        itemArticle3.setItemTopicId(topicId);
        itemArticle3.setArticleTopic("articleTopic3");
        itemArticles.add(itemArticle3);

        ItemArticle itemArticle4 = new ItemArticle();
        itemArticle4.setArticleId(4L);
        itemArticle4.setItemTopicId(topicId);
        itemArticle4.setArticleTopic("articleTopic4");
        itemArticles.add(itemArticle4);

        ItemArticle itemArticle5 = new ItemArticle();
        itemArticle5.setArticleId(5L);
        itemArticle5.setItemTopicId(topicId);
        itemArticle5.setArticleTopic("articleTopic5");
        itemArticles.add(itemArticle5);

        ItemArticle itemArticle6 = new ItemArticle();
        itemArticle6.setArticleId(6L);
        itemArticle6.setItemTopicId(topicId);
        itemArticle6.setArticleTopic("articleTopic6");
        itemArticles.add(itemArticle6);

        return itemArticles;
    }


    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void create(ItemArticle itemArticle) {

    }
}
