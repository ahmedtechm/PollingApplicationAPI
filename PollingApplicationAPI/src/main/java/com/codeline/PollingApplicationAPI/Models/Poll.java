package com.codeline.PollingApplicationAPI.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Data
@Entity
public class Poll  extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String question;
    @ElementCollection
    List<String> choices = new ArrayList<>();

}
