package org.application.entities;


import javax.persistence.Column;
import javax.persistence.*;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@Column(nullable = false)
    private String username;
	
	@Column(nullable = false)
    private String email;
	
	@Column(nullable = false)
	private String password;

    public User() { }

    public User(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() { 
    	return email; 
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
			return password;
		}

	public void setPassword(String password) {
		this.password = password;
	}
    
    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public static class UserBuilder {
        private long id;
        private String username;
        private String email;
        private String password;

		public UserBuilder id(long id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder address(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(id, username, email, password);
        }
    }
}