package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.GenerationType;


@javax.persistence.Entity
@javax.persistence.Table(name = "tb_sales")
public class Sale {
	
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public Sale() {
		
	}
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getSellerName()
	{
		return sellerName;
	}
	
	public void setSellerName(String sellerName)
	{
		this.sellerName = sellerName;
	}
	
	public Integer getVisited()
	{
		return visited;
	}
	
	public void setVisited(Integer visited)
	{
		this.visited = visited;
	}
	
	public Integer getDeals()
	{
		return deals;
	}
	
	public void setDeals(Integer deals)
	{
		this.deals = deals;
	}
	
	public Double getAmount()
	{
		return amount;
	}
	
	public void setAmount(Double amount)
	{
		this.amount = amount;
	}
	
	public LocalDate getDate()
	{
		return date;
	}
	
	public void setDate(LocalDate date)
	{
		this.date = date;
	}
	

}
