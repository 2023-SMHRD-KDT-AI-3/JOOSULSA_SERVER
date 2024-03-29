package com.joosulsa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_point_earn")
public class Tb_Point_Earn {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "earn_num")
    private Long earnNum;

    @Column(name = "earn_point", nullable = false)
    private Integer earnPoint;

    @Column(name = "earned_at", nullable = false)
    private String earnedAt;

    @ManyToOne
    @JoinColumn(referencedColumnName = "user_id")
    @JsonBackReference
    private Tb_User userId;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "quiz_num")
    @JsonBackReference
    private Tb_Quiz quizNum;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "recycle_num")
    @JsonBackReference
    private Tb_Recycling recycleNum;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "att_num")
    @JsonBackReference
    private Tb_Attendance attNum;
	
    @ManyToOne
    @JoinColumn(referencedColumnName = "town_num")
    @JsonBackReference
    private Tb_Town townNum;
	
    // StackOverflowError 에러 해결
    @Override
    public String toString() {
    	return "Tb_Point_Earn";
    }
    
    
}



