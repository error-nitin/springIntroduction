package com.springintroduction.test.SpringIntroduction.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SalaryInformation {
	private float basic;
	private float hra;
	private float da;
	private float pf;
	private float foodCoupon;
	
	public SalaryInformation() {
		
	}
	
	public SalaryInformation(float basic, float foodCoupon) {
		this.basic = basic;
		this.foodCoupon = foodCoupon;
	}

	public float getBasic() {
		return basic;
	}

	public void setBasic(float basic) {
		this.basic = basic;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public float getDa() {
		return da;
	}

	public void setDa(float da) {
		this.da = da;
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

	public float getFoodCoupon() {
		return foodCoupon;
	}

	public void setFoodCoupon(float foodCoupon) {
		this.foodCoupon = foodCoupon;
	}

	@Override
	public String toString() {
		return "SalaryInformation [basic=" + basic + ", hra=" + hra + ", da=" + da + ", pf=" + pf + ", foodCoupon="
				+ foodCoupon + "]";
	}
	
	
}
