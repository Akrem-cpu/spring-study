package com.akrem.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class DebitAccount extends Account {
    BigDecimal overDraftFee;
}
