package org.sid.query.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.commonapi.enums.AccountStatus;
import org.sid.commonapi.enums.OperationType;


import javax.persistence.*;
import java.util.Collections;
import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType operationType;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Account account;

}
