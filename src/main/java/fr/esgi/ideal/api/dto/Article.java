package fr.esgi.ideal.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class Article {
    /**
     * ID of the article in the database
     */
    private Long id;

    /**
     * Name of the article
     */
    private String name;

    /**
     * Date created & updated
     */
    private OffsetDateTime created, updated; // RFC3339/ISO8601

    /**
     * Id of the user creating this article
     */
    private Long createBy;

    /**
     * Description of article
     */
    private String description;

    /**
     * Price of article
     */
    private Float price;

    /**
     * Infos on image
     */
    //private Image img;
    private Long img;

    /**
     * Rate (ratio) satisfaction for the product by customers
     */
    private Float customerRating;
    private Integer customerRatingPositive, customerRatingNegative;
}
