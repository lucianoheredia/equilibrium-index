package br.com.lucianoheredia.equilibriumindex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EquilibriumIndexApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void findFirstEquilibriumIndexArray(){
		int expectedValue = 3;
		int[] nums = {-7, 1, 5, 2, -4, 3, 0};

		Integer eqIndexOfAnArray = EquilibriumIndexApplication.findEqIndexOfAnArray(nums);

		Assertions.assertThat(eqIndexOfAnArray).isEqualTo(expectedValue);
	}
}
