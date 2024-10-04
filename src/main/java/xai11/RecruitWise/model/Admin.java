package xai11.RecruitWise.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    private String name;

    private String ApiKeyHH; //регаемся на https://api.hh.ru/ и получаем ключ


}
