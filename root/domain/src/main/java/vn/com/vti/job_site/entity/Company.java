package vn.com.vti.job_site.entity;

public class Company {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.company.company_id
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.company.company_name
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.company.business_type_id
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    private Integer businessTypeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.company.company_id
     *
     * @return the value of public.company.company_id
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.company.company_id
     *
     * @param companyId the value for public.company.company_id
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.company.company_name
     *
     * @return the value of public.company.company_name
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.company.company_name
     *
     * @param companyName the value for public.company.company_name
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.company.business_type_id
     *
     * @return the value of public.company.business_type_id
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    public Integer getBusinessTypeId() {
        return businessTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.company.business_type_id
     *
     * @param businessTypeId the value for public.company.business_type_id
     *
     * @mbg.generated Mon Oct 28 23:23:08 JST 2024
     */
    public void setBusinessTypeId(Integer businessTypeId) {
        this.businessTypeId = businessTypeId;
    }
}