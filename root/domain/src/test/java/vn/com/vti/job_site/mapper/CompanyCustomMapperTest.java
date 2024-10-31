package vn.com.vti.job_site.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import vn.com.vti.job_site.entity.CompanyCustom;

@SpringJUnitConfig(locations = {"classpath:test-context.xml"})
class CompanyCustomMapperTest {
	@Autowired
	private CompanyCustomMapper companyCustomMapper;
	
	@Test
	void test() {
		List<CompanyCustom> companyCustomList = companyCustomMapper.selectAll();
		for(CompanyCustom company : companyCustomList) {
			System.out.println(company.getBusinessTypeName());
		}
	}

}
