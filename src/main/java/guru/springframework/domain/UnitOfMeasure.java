/* 
User: Urmi
Date: 1/2/2020 
Time: 10:49 AM
*/

package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

}
