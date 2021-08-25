package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "hibernate_student")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "student_name")
	private String name;

	@Column
	@Enumerated(EnumType.STRING)
	private Gender gender;

	public Student(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

}
