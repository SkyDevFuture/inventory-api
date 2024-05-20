package com.developersthefuture.inventoryapi.insfrastructure.common;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners({ AuditingEntityListener.class })
public class AbstractBaseAuditable<U> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * True if the record is active otherwise false
     */
    @Column(name = "is_active")
    protected Boolean isActive;

    /**
     * Date of the last modification
     */
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    protected Date updatedAt;

    /**
     * Date of the last modification
     */
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false)
    protected Date createdAt;

    /**
     * User who created the record
     */
    @CreatedBy
    @Column(name = "created_user", updatable = false, nullable = false)
    protected String creatorUserId;

    /**
     * User who made the last modification of the registry
     */
    @LastModifiedBy
    @Column(name = "updated_user")
    protected String updaterUserId;

}