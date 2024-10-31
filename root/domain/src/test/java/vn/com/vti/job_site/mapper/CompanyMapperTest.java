package vn.com.vti.job_site.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import vn.com.vti.job_site.entity.Company;

@SpringJUnitConfig(locations = {"classpath:test-context.xml"})
class CompanyMapperTest {

	@Autowired
	private CompanyMapper companyMapper;
	@Test
	void test() {
		Company company = companyMapper.selectByPrimaryKey(991);
		System.out.println(company.getCompanyName());
	}

}
