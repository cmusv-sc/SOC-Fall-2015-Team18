package models;

/**
 * Created by zmhbh on 12/3/15.
 */
public class TagCloud {
    private String text;
    private int weight;
    private String link;

    public TagCloud(String text, int weight) {
        this.text = text;
        this.weight = weight;
        this.link="http://localhost:9000/tag/tags";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "TagCloud{" +
                "text='" + text + '\'' +
                ", weight=" + weight +
                ", link='" + link + '\'' +
                '}';
    }
}
