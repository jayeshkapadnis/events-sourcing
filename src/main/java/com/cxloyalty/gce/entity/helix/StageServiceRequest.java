// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="stage_service_request", indexes={@Index(name="stage_service_request_cb_evnt_bkng_sysid_IX", columnList="cb_evnt_bkng_sysid", unique=true), @Index(name="stage_service_request_onsale_reg_evt_bkng_id_IX", columnList="onsale_reg_evt_bkng_id", unique=true), @Index(name="stage_service_request_voucher_header_id_IX", columnList="voucher_header_id", unique=true)})
public class StageServiceRequest implements Serializable {

    /** Primary key. */
    protected static final String PK = "requestSysid";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="request_sysid", unique=true, nullable=false, precision=19)
    private long requestSysid;
    @Column(name="request_type", nullable=false, precision=9)
    private BigDecimal requestType;
    @Column(name="request_subtype", precision=9)
    private BigDecimal requestSubtype;
    @Column(nullable=false, length=500)
    private String severity;
    @Column(length=100)
    private String summary;
    @Column(length=2000)
    private String description;
    @Column(name="internal_comments", length=2000)
    private String internalComments;
    @Column(nullable=false, length=500)
    private String status;
    @Column(length=500)
    private String substatus;
    @Column(name="status_comments", length=200)
    private String statusComments;
    @Column(name="status_date", nullable=false)
    private Timestamp statusDate;
    @Column(name="mem_subscription_detail_id", precision=10)
    private BigDecimal memSubscriptionDetailId;
    @Column(name="package_id", precision=19)
    private long packageId;
    @Column(name="benefit_id", precision=19)
    private long benefitId;
    @Column(name="protected_card_sysid", precision=9)
    private BigDecimal protectedCardSysid;
    @Column(name="generic_asset_sysid", precision=9)
    private BigDecimal genericAssetSysid;
    @Column(name="closed_date")
    private Timestamp closedDate;
    @Column(nullable=false, length=500)
    private String channel;
    @Column(name="activation_date")
    private Timestamp activationDate;
    @Column(name="organization_sysid", nullable=false, precision=9)
    private BigDecimal organizationSysid;
    @Column(name="reported_by", length=100)
    private String reportedBy;
    @Column(name="resolution_desc", length=2000)
    private String resolutionDesc;
    @Column(name="owner_username", length=30)
    private String ownerUsername;
    @Column(name="add_username", nullable=false, length=30)
    private String addUsername;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="update_username", nullable=false, length=30)
    private String updateUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="received_date")
    private Timestamp receivedDate;
    @Column(name="reported_date")
    private Timestamp reportedDate;
    @Column(name="om_order_id", precision=19)
    private long omOrderId;
    @Column(name="transaction_amount", precision=10, scale=2)
    private BigDecimal transactionAmount;
    @Column(name="transaction_date")
    private Timestamp transactionDate;
    @Column(name="source_system_desc", length=40)
    private String sourceSystemDesc;
    @Column(name="source_system_id", precision=4)
    private BigDecimal sourceSystemId;
    @Column(name="rqst_ntl_trst_pass_sysid", precision=19)
    private long rqstNtlTrstPassSysid;
    @Column(name="expiration_date")
    private Timestamp expirationDate;
    @Column(name="natl_trst_pass_email_address", length=100)
    private String natlTrstPassEmailAddress;
    @Column(name="reference_num", length=100)
    private String referenceNum;
    @Column(name="natl_trst_pass_add_date")
    private Timestamp natlTrstPassAddDate;
    @Column(name="natl_trst_pass_add_username", length=50)
    private String natlTrstPassAddUsername;
    @Column(name="natl_trst_pass_update_date")
    private Timestamp natlTrstPassUpdateDate;
    @Column(name="natl_trst_pass_update_username", length=50)
    private String natlTrstPassUpdateUsername;
    @Column(name="fulfillment_channel", length=500)
    private String fulfillmentChannel;
    @Column(name="cash_back_sysid", precision=19)
    private long cashBackSysid;
    @Column(name="cash_back_rule_id", precision=10)
    private BigDecimal cashBackRuleId;
    @Column(name="cash_back_payment_amt", precision=22, scale=7)
    private BigDecimal cashBackPaymentAmt;
    @Column(name="cash_back_transaction_amt", precision=22, scale=7)
    private BigDecimal cashBackTransactionAmt;
    @Column(name="cash_back_add_date")
    private Timestamp cashBackAddDate;
    @Column(name="cash_back_add_username", length=200)
    private String cashBackAddUsername;
    @Column(name="cash_back_update_date")
    private Timestamp cashBackUpdateDate;
    @Column(name="cash_back_update_username", length=200)
    private String cashBackUpdateUsername;
    @Column(name="vendor_name", length=100)
    private String vendorName;
    @Column(name="vendor_id", precision=19)
    private long vendorId;
    @Column(name="complaint_sysid", precision=19)
    private long complaintSysid;
    @Column(name="loss_date")
    private Timestamp lossDate;
    @Column(name="place_of_loss", length=200)
    private String placeOfLoss;
    @Column(length=100)
    private String product;
    @Column(length=500)
    private String reason;
    @Column(name="comp_amount", precision=22, scale=7)
    private BigDecimal compAmount;
    @Column(name="comp_amount_currency", length=500)
    private String compAmountCurrency;
    @Column(name="benefits_explained", length=1)
    private String benefitsExplained;
    @Column(name="detl_not_explained", length=255)
    private String detlNotExplained;
    @Column(name="excl_highlighted", length=1)
    private String exclHighlighted;
    @Column(name="feat_explained", length=1)
    private String featExplained;
    @Column(name="complaint_add_date")
    private Timestamp complaintAddDate;
    @Column(name="complaint_add_username", length=50)
    private String complaintAddUsername;
    @Column(name="complaint_update_date")
    private Timestamp complaintUpdateDate;
    @Column(name="complaint_update_username", length=50)
    private String complaintUpdateUsername;
    @Column(length=500)
    private String complainant;
    @Column(name="compensation_type", length=500)
    private String compensationType;
    @Column(name="received_date_from_partner")
    private Timestamp receivedDateFromPartner;
    @Column(name="received_by", length=500)
    private String receivedBy;
    @Column(name="reply_to", length=500)
    private String replyTo;
    @Column(name="cb_evnt_bkng_sysid", unique=true, precision=19)
    private long cbEvntBkngSysid;
    @Column(name="entrtnmnt_evnt_name", length=200)
    private String entrtnmntEvntName;
    @Column(name="entrtnmnt_evnt_date")
    private Timestamp entrtnmntEvntDate;
    @Column(name="seat_details_txt", length=300)
    private String seatDetailsTxt;
    @Column(name="evnt_bkng_cancel_reason_desc", length=500)
    private String evntBkngCancelReasonDesc;
    @Column(name="evnt_bkng_cancel_reason_id", precision=9)
    private BigDecimal evntBkngCancelReasonId;
    @Column(name="venue_desc", length=500)
    private String venueDesc;
    @Column(name="venue_id", precision=9)
    private BigDecimal venueId;
    @Column(name="venue_other_name", length=200)
    private String venueOtherName;
    @Column(name="event_bkng_email_txt", length=200)
    private String eventBkngEmailTxt;
    @Column(name="rqst_cb_evt_book_address_sysid", precision=19)
    private long rqstCbEvtBookAddressSysid;
    @Column(name="rqst_cb_evt_book_ticket_delivery_type_desc", length=500)
    private String rqstCbEvtBookTicketDeliveryTypeDesc;
    @Column(name="rqst_cb_evt_book_ticket_delivery_type_id", precision=9)
    private BigDecimal rqstCbEvtBookTicketDeliveryTypeId;
    @Column(name="rqst_cb_evt_book_ticket_provider_desc", length=500)
    private String rqstCbEvtBookTicketProviderDesc;
    @Column(name="rqst_cb_evt_book_ticket_provider_id", precision=9)
    private BigDecimal rqstCbEvtBookTicketProviderId;
    @Column(name="bkng_refrnc_nr", length=50)
    private String bkngRefrncNr;
    @Column(name="postage_amt", precision=22, scale=7)
    private BigDecimal postageAmt;
    @Column(name="total_bkng_fee_amt", precision=22, scale=7)
    private BigDecimal totalBkngFeeAmt;
    @Column(name="total_price_amt", precision=22, scale=7)
    private BigDecimal totalPriceAmt;
    @Column(name="total_price_after_cb_amt", precision=22, scale=7)
    private BigDecimal totalPriceAfterCbAmt;
    @Column(name="total_cb_amt", precision=22, scale=7)
    private BigDecimal totalCbAmt;
    @Column(name="rqst_cb_evt_book_total_ticket_qty", precision=9)
    private BigDecimal rqstCbEvtBookTotalTicketQty;
    @Column(name="cb_ineligible_fl", precision=1)
    private BigDecimal cbIneligibleFl;
    @Column(name="rqst_cb_evt_book_add_date")
    private Timestamp rqstCbEvtBookAddDate;
    @Column(name="rqst_cb_evt_book_add_username", length=200)
    private String rqstCbEvtBookAddUsername;
    @Column(name="rqst_cb_evt_book_update_date")
    private Timestamp rqstCbEvtBookUpdateDate;
    @Column(name="rqst_cb_evt_book_update_username", length=200)
    private String rqstCbEvtBookUpdateUsername;
    @Column(name="evnt_catgry_id", precision=9)
    private BigDecimal evntCatgryId;
    @Column(name="venue_city_id", precision=9)
    private BigDecimal venueCityId;
    @Column(name="extra_cashback_pct_desc", length=500)
    private String extraCashbackPctDesc;
    @Column(name="extra_cashback_pct_id", precision=9)
    private BigDecimal extraCashbackPctId;
    @Column(name="cb_last_booking_fl", precision=1)
    private BigDecimal cbLastBookingFl;
    @Column(name="extra_cb_amt", precision=22, scale=7)
    private BigDecimal extraCbAmt;
    @Column(name="currency_conversion_id", precision=10)
    private BigDecimal currencyConversionId;
    @Column(name="purchase_date")
    private Timestamp purchaseDate;
    @Column(name="rqst_cb_evt_book_delivery_name", length=100)
    private String rqstCbEvtBookDeliveryName;
    @Column(name="booking_date")
    private Timestamp bookingDate;
    @Column(name="evnt_catgry_name", length=200)
    private String evntCatgryName;
    @Column(name="rqst_cb_evt_book_source_order_ref", length=200)
    private String rqstCbEvtBookSourceOrderRef;
    @Column(name="venue_city", length=100)
    private String venueCity;
    @Column(name="rqst_cb_evt_book_vendor_event_ref", length=100)
    private String rqstCbEvtBookVendorEventRef;
    @Column(name="rqst_cb_evt_book_preregistration_fl", precision=1)
    private BigDecimal rqstCbEvtBookPreregistrationFl;
    @Column(name="address_1", length=100)
    private String address1;
    @Column(name="address_2", length=100)
    private String address2;
    @Column(name="address_3", length=100)
    private String address3;
    @Column(length=100)
    private String city;
    @Column(length=100)
    private String county;
    @Column(name="postal_code", length=30)
    private String postalCode;
    @Column(precision=10)
    private BigDecimal country;
    @Column(name="phone_num", length=40)
    private String phoneNum;
    @Column(name="phone_num_2", length=40)
    private String phoneNum2;
    @Column(name="mobile_num", length=40)
    private String mobileNum;
    @Column(name="address_add_date")
    private Timestamp addressAddDate;
    @Column(name="address_add_username", length=50)
    private String addressAddUsername;
    @Column(name="address_update_date")
    private Timestamp addressUpdateDate;
    @Column(name="address_update_username", length=50)
    private String addressUpdateUsername;
    @Column(name="onsale_reg_evt_bkng_id", unique=true, precision=19)
    private long onsaleRegEvtBkngId;
    @Column(name="booking_request_id", precision=19)
    private long bookingRequestId;
    @Column(name="reg_evt_bkng_address_id", precision=19)
    private long regEvtBkngAddressId;
    @Column(name="reg_evt_bkng_delivery_name", length=100)
    private String regEvtBkngDeliveryName;
    @Column(name="reg_evt_bkng_ticket_provider", length=200)
    private String regEvtBkngTicketProvider;
    @Column(name="reg_evt_bkng_evnt_name", length=200)
    private String regEvtBkngEvntName;
    @Column(name="reg_evt_bkng_vendor_event_ref", length=100)
    private String regEvtBkngVendorEventRef;
    @Column(name="evnt_onsale_date")
    private Timestamp evntOnsaleDate;
    @Column(name="evnt_category_id", length=200)
    private String evntCategoryId;
    @Column(name="evnt_category_name", length=200)
    private String evntCategoryName;
    @Column(name="evnt_bkng_email_txt", length=200)
    private String evntBkngEmailTxt;
    @Column(name="evnt_bkng_cancel_reason", length=200)
    private String evntBkngCancelReason;
    @Column(name="reg_evt_bkng_preregistration_fl", precision=1)
    private BigDecimal regEvtBkngPreregistrationFl;
    @Column(name="reg_evt_bkng_total_tickets_qty", precision=10)
    private BigDecimal regEvtBkngTotalTicketsQty;
    @Column(name="reg_evt_bkng_ticket_delivery_type", length=200)
    private String regEvtBkngTicketDeliveryType;
    @Column(name="ticket_currency", length=3)
    private String ticketCurrency;
    @Column(name="min_ticket_price", precision=10, scale=2)
    private BigDecimal minTicketPrice;
    @Column(name="max_ticket_price", precision=10, scale=2)
    private BigDecimal maxTicketPrice;
    @Column(name="pref_ticket_price", precision=10, scale=2)
    private BigDecimal prefTicketPrice;
    @Column(name="possible_performances", length=2000)
    private String possiblePerformances;
    @Column(name="special_reqs", length=2000)
    private String specialReqs;
    @Column(name="preference_notes", length=200)
    private String preferenceNotes;
    @Column(name="reg_evt_bkng_user_created", length=200)
    private String regEvtBkngUserCreated;
    @Column(name="reg_evt_bkng_date_created")
    private Timestamp regEvtBkngDateCreated;
    @Column(name="reg_evt_bkng_user_modified", length=200)
    private String regEvtBkngUserModified;
    @Column(name="reg_evt_bkng_date_modified")
    private Timestamp regEvtBkngDateModified;
    @Column(name="onsale_reg_evt_bkng_pref_id", precision=19)
    private long onsaleRegEvtBkngPrefId;
    @Column(name="reg_evt_bkng_pref_user_created", length=200)
    private String regEvtBkngPrefUserCreated;
    @Column(name="reg_evt_bkng_pref_date_created")
    private Timestamp regEvtBkngPrefDateCreated;
    @Column(name="reg_evt_bkng_pref_user_modified", length=200)
    private String regEvtBkngPrefUserModified;
    @Column(name="reg_evt_bkng_pref_date_modified")
    private Timestamp regEvtBkngPrefDateModified;
    @Column(name="preference_1", length=400)
    private String preference1;
    @Column(name="preference_2", length=400)
    private String preference2;
    @Column(name="preference_3", length=400)
    private String preference3;
    @Column(name="preference_4", length=400)
    private String preference4;
    @Column(name="preference_5", length=400)
    private String preference5;
    @Column(name="voucher_header_id", unique=true, precision=19)
    private long voucherHeaderId;
    @Column(name="customer_firstname", length=100)
    private String customerFirstname;
    @Column(name="customer_lastname", length=100)
    private String customerLastname;
    @Column(name="voucher_header_customer_email", length=240)
    private String voucherHeaderCustomerEmail;
    @Column(name="voucher_supplier", length=100)
    private String voucherSupplier;
    @Column(name="voucher_header_tran_total_amt", precision=16, scale=2)
    private BigDecimal voucherHeaderTranTotalAmt;
    @Column(name="trans_amount_excluding_vat", precision=16, scale=2)
    private BigDecimal transAmountExcludingVat;
    @Column(name="transaction_voucher_quantity", precision=9)
    private BigDecimal transactionVoucherQuantity;
    @Column(name="transaction_ticket_quantity", precision=9)
    private BigDecimal transactionTicketQuantity;
    @Column(name="voucher_header_user_created", length=200)
    private String voucherHeaderUserCreated;
    @Column(name="voucher_header_date_created")
    private Timestamp voucherHeaderDateCreated;
    @Column(name="voucher_header_user_modified", length=200)
    private String voucherHeaderUserModified;
    @Column(name="voucher_header_date_modified")
    private Timestamp voucherHeaderDateModified;
    @Column(name="voucher_header_transaction_pdf_url", length=2000)
    private String voucherHeaderTransactionPdfUrl;
    @Column(name="currency_type_id", precision=10)
    private BigDecimal currencyTypeId;
    @Column(name="voucher_header_source_order_ref", length=100)
    private String voucherHeaderSourceOrderRef;
    @Column(name="voucher_header_transaction_date")
    private Timestamp voucherHeaderTransactionDate;
    @Column(name="membership_id", nullable=false, precision=19)
    private long membershipId;
    @Column(name="stage_created_date")
    private Timestamp stageCreatedDate;
    @Column(name="stage_updated_date")
    private Timestamp stageUpdatedDate;
    @OneToMany(mappedBy="stageServiceRequest")
    private Set<StageCbEvntBkngLine> stageCbEvntBkngLine;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;
    @OneToMany(mappedBy="stageServiceRequest")
    private Set<StageOnsaleRegEvtBkngLine> stageOnsaleRegEvtBkngLine;
    @OneToMany(mappedBy="stageServiceRequest")
    private Set<StageServiceActivity> stageServiceActivity;
    @OneToMany(mappedBy="stageServiceRequest")
    private Set<StageCommEvent> stageCommEvent;
    @OneToMany(mappedBy="stageServiceRequest")
    private Set<StageVoucherDetail> stageVoucherDetail;

    /** Default constructor. */
    public StageServiceRequest() {
        super();
    }

    /**
     * Access method for requestSysid.
     *
     * @return the current value of requestSysid
     */
    public long getRequestSysid() {
        return requestSysid;
    }

    /**
     * Setter method for requestSysid.
     *
     * @param aRequestSysid the new value for requestSysid
     */
    public void setRequestSysid(long aRequestSysid) {
        requestSysid = aRequestSysid;
    }

    /**
     * Access method for requestType.
     *
     * @return the current value of requestType
     */
    public BigDecimal getRequestType() {
        return requestType;
    }

    /**
     * Setter method for requestType.
     *
     * @param aRequestType the new value for requestType
     */
    public void setRequestType(BigDecimal aRequestType) {
        requestType = aRequestType;
    }

    /**
     * Access method for requestSubtype.
     *
     * @return the current value of requestSubtype
     */
    public BigDecimal getRequestSubtype() {
        return requestSubtype;
    }

    /**
     * Setter method for requestSubtype.
     *
     * @param aRequestSubtype the new value for requestSubtype
     */
    public void setRequestSubtype(BigDecimal aRequestSubtype) {
        requestSubtype = aRequestSubtype;
    }

    /**
     * Access method for severity.
     *
     * @return the current value of severity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Setter method for severity.
     *
     * @param aSeverity the new value for severity
     */
    public void setSeverity(String aSeverity) {
        severity = aSeverity;
    }

    /**
     * Access method for summary.
     *
     * @return the current value of summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Setter method for summary.
     *
     * @param aSummary the new value for summary
     */
    public void setSummary(String aSummary) {
        summary = aSummary;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for internalComments.
     *
     * @return the current value of internalComments
     */
    public String getInternalComments() {
        return internalComments;
    }

    /**
     * Setter method for internalComments.
     *
     * @param aInternalComments the new value for internalComments
     */
    public void setInternalComments(String aInternalComments) {
        internalComments = aInternalComments;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for substatus.
     *
     * @return the current value of substatus
     */
    public String getSubstatus() {
        return substatus;
    }

    /**
     * Setter method for substatus.
     *
     * @param aSubstatus the new value for substatus
     */
    public void setSubstatus(String aSubstatus) {
        substatus = aSubstatus;
    }

    /**
     * Access method for statusComments.
     *
     * @return the current value of statusComments
     */
    public String getStatusComments() {
        return statusComments;
    }

    /**
     * Setter method for statusComments.
     *
     * @param aStatusComments the new value for statusComments
     */
    public void setStatusComments(String aStatusComments) {
        statusComments = aStatusComments;
    }

    /**
     * Access method for statusDate.
     *
     * @return the current value of statusDate
     */
    public Timestamp getStatusDate() {
        return statusDate;
    }

    /**
     * Setter method for statusDate.
     *
     * @param aStatusDate the new value for statusDate
     */
    public void setStatusDate(Timestamp aStatusDate) {
        statusDate = aStatusDate;
    }

    /**
     * Access method for memSubscriptionDetailId.
     *
     * @return the current value of memSubscriptionDetailId
     */
    public BigDecimal getMemSubscriptionDetailId() {
        return memSubscriptionDetailId;
    }

    /**
     * Setter method for memSubscriptionDetailId.
     *
     * @param aMemSubscriptionDetailId the new value for memSubscriptionDetailId
     */
    public void setMemSubscriptionDetailId(BigDecimal aMemSubscriptionDetailId) {
        memSubscriptionDetailId = aMemSubscriptionDetailId;
    }

    /**
     * Access method for packageId.
     *
     * @return the current value of packageId
     */
    public long getPackageId() {
        return packageId;
    }

    /**
     * Setter method for packageId.
     *
     * @param aPackageId the new value for packageId
     */
    public void setPackageId(long aPackageId) {
        packageId = aPackageId;
    }

    /**
     * Access method for benefitId.
     *
     * @return the current value of benefitId
     */
    public long getBenefitId() {
        return benefitId;
    }

    /**
     * Setter method for benefitId.
     *
     * @param aBenefitId the new value for benefitId
     */
    public void setBenefitId(long aBenefitId) {
        benefitId = aBenefitId;
    }

    /**
     * Access method for protectedCardSysid.
     *
     * @return the current value of protectedCardSysid
     */
    public BigDecimal getProtectedCardSysid() {
        return protectedCardSysid;
    }

    /**
     * Setter method for protectedCardSysid.
     *
     * @param aProtectedCardSysid the new value for protectedCardSysid
     */
    public void setProtectedCardSysid(BigDecimal aProtectedCardSysid) {
        protectedCardSysid = aProtectedCardSysid;
    }

    /**
     * Access method for genericAssetSysid.
     *
     * @return the current value of genericAssetSysid
     */
    public BigDecimal getGenericAssetSysid() {
        return genericAssetSysid;
    }

    /**
     * Setter method for genericAssetSysid.
     *
     * @param aGenericAssetSysid the new value for genericAssetSysid
     */
    public void setGenericAssetSysid(BigDecimal aGenericAssetSysid) {
        genericAssetSysid = aGenericAssetSysid;
    }

    /**
     * Access method for closedDate.
     *
     * @return the current value of closedDate
     */
    public Timestamp getClosedDate() {
        return closedDate;
    }

    /**
     * Setter method for closedDate.
     *
     * @param aClosedDate the new value for closedDate
     */
    public void setClosedDate(Timestamp aClosedDate) {
        closedDate = aClosedDate;
    }

    /**
     * Access method for channel.
     *
     * @return the current value of channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Setter method for channel.
     *
     * @param aChannel the new value for channel
     */
    public void setChannel(String aChannel) {
        channel = aChannel;
    }

    /**
     * Access method for activationDate.
     *
     * @return the current value of activationDate
     */
    public Timestamp getActivationDate() {
        return activationDate;
    }

    /**
     * Setter method for activationDate.
     *
     * @param aActivationDate the new value for activationDate
     */
    public void setActivationDate(Timestamp aActivationDate) {
        activationDate = aActivationDate;
    }

    /**
     * Access method for organizationSysid.
     *
     * @return the current value of organizationSysid
     */
    public BigDecimal getOrganizationSysid() {
        return organizationSysid;
    }

    /**
     * Setter method for organizationSysid.
     *
     * @param aOrganizationSysid the new value for organizationSysid
     */
    public void setOrganizationSysid(BigDecimal aOrganizationSysid) {
        organizationSysid = aOrganizationSysid;
    }

    /**
     * Access method for reportedBy.
     *
     * @return the current value of reportedBy
     */
    public String getReportedBy() {
        return reportedBy;
    }

    /**
     * Setter method for reportedBy.
     *
     * @param aReportedBy the new value for reportedBy
     */
    public void setReportedBy(String aReportedBy) {
        reportedBy = aReportedBy;
    }

    /**
     * Access method for resolutionDesc.
     *
     * @return the current value of resolutionDesc
     */
    public String getResolutionDesc() {
        return resolutionDesc;
    }

    /**
     * Setter method for resolutionDesc.
     *
     * @param aResolutionDesc the new value for resolutionDesc
     */
    public void setResolutionDesc(String aResolutionDesc) {
        resolutionDesc = aResolutionDesc;
    }

    /**
     * Access method for ownerUsername.
     *
     * @return the current value of ownerUsername
     */
    public String getOwnerUsername() {
        return ownerUsername;
    }

    /**
     * Setter method for ownerUsername.
     *
     * @param aOwnerUsername the new value for ownerUsername
     */
    public void setOwnerUsername(String aOwnerUsername) {
        ownerUsername = aOwnerUsername;
    }

    /**
     * Access method for addUsername.
     *
     * @return the current value of addUsername
     */
    public String getAddUsername() {
        return addUsername;
    }

    /**
     * Setter method for addUsername.
     *
     * @param aAddUsername the new value for addUsername
     */
    public void setAddUsername(String aAddUsername) {
        addUsername = aAddUsername;
    }

    /**
     * Access method for addDate.
     *
     * @return the current value of addDate
     */
    public Timestamp getAddDate() {
        return addDate;
    }

    /**
     * Setter method for addDate.
     *
     * @param aAddDate the new value for addDate
     */
    public void setAddDate(Timestamp aAddDate) {
        addDate = aAddDate;
    }

    /**
     * Access method for updateUsername.
     *
     * @return the current value of updateUsername
     */
    public String getUpdateUsername() {
        return updateUsername;
    }

    /**
     * Setter method for updateUsername.
     *
     * @param aUpdateUsername the new value for updateUsername
     */
    public void setUpdateUsername(String aUpdateUsername) {
        updateUsername = aUpdateUsername;
    }

    /**
     * Access method for updateDate.
     *
     * @return the current value of updateDate
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * Setter method for updateDate.
     *
     * @param aUpdateDate the new value for updateDate
     */
    public void setUpdateDate(Timestamp aUpdateDate) {
        updateDate = aUpdateDate;
    }

    /**
     * Access method for receivedDate.
     *
     * @return the current value of receivedDate
     */
    public Timestamp getReceivedDate() {
        return receivedDate;
    }

    /**
     * Setter method for receivedDate.
     *
     * @param aReceivedDate the new value for receivedDate
     */
    public void setReceivedDate(Timestamp aReceivedDate) {
        receivedDate = aReceivedDate;
    }

    /**
     * Access method for reportedDate.
     *
     * @return the current value of reportedDate
     */
    public Timestamp getReportedDate() {
        return reportedDate;
    }

    /**
     * Setter method for reportedDate.
     *
     * @param aReportedDate the new value for reportedDate
     */
    public void setReportedDate(Timestamp aReportedDate) {
        reportedDate = aReportedDate;
    }

    /**
     * Access method for omOrderId.
     *
     * @return the current value of omOrderId
     */
    public long getOmOrderId() {
        return omOrderId;
    }

    /**
     * Setter method for omOrderId.
     *
     * @param aOmOrderId the new value for omOrderId
     */
    public void setOmOrderId(long aOmOrderId) {
        omOrderId = aOmOrderId;
    }

    /**
     * Access method for transactionAmount.
     *
     * @return the current value of transactionAmount
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter method for transactionAmount.
     *
     * @param aTransactionAmount the new value for transactionAmount
     */
    public void setTransactionAmount(BigDecimal aTransactionAmount) {
        transactionAmount = aTransactionAmount;
    }

    /**
     * Access method for transactionDate.
     *
     * @return the current value of transactionDate
     */
    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    /**
     * Setter method for transactionDate.
     *
     * @param aTransactionDate the new value for transactionDate
     */
    public void setTransactionDate(Timestamp aTransactionDate) {
        transactionDate = aTransactionDate;
    }

    /**
     * Access method for sourceSystemDesc.
     *
     * @return the current value of sourceSystemDesc
     */
    public String getSourceSystemDesc() {
        return sourceSystemDesc;
    }

    /**
     * Setter method for sourceSystemDesc.
     *
     * @param aSourceSystemDesc the new value for sourceSystemDesc
     */
    public void setSourceSystemDesc(String aSourceSystemDesc) {
        sourceSystemDesc = aSourceSystemDesc;
    }

    /**
     * Access method for sourceSystemId.
     *
     * @return the current value of sourceSystemId
     */
    public BigDecimal getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Setter method for sourceSystemId.
     *
     * @param aSourceSystemId the new value for sourceSystemId
     */
    public void setSourceSystemId(BigDecimal aSourceSystemId) {
        sourceSystemId = aSourceSystemId;
    }

    /**
     * Access method for rqstNtlTrstPassSysid.
     *
     * @return the current value of rqstNtlTrstPassSysid
     */
    public long getRqstNtlTrstPassSysid() {
        return rqstNtlTrstPassSysid;
    }

    /**
     * Setter method for rqstNtlTrstPassSysid.
     *
     * @param aRqstNtlTrstPassSysid the new value for rqstNtlTrstPassSysid
     */
    public void setRqstNtlTrstPassSysid(long aRqstNtlTrstPassSysid) {
        rqstNtlTrstPassSysid = aRqstNtlTrstPassSysid;
    }

    /**
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Timestamp aExpirationDate) {
        expirationDate = aExpirationDate;
    }

    /**
     * Access method for natlTrstPassEmailAddress.
     *
     * @return the current value of natlTrstPassEmailAddress
     */
    public String getNatlTrstPassEmailAddress() {
        return natlTrstPassEmailAddress;
    }

    /**
     * Setter method for natlTrstPassEmailAddress.
     *
     * @param aNatlTrstPassEmailAddress the new value for natlTrstPassEmailAddress
     */
    public void setNatlTrstPassEmailAddress(String aNatlTrstPassEmailAddress) {
        natlTrstPassEmailAddress = aNatlTrstPassEmailAddress;
    }

    /**
     * Access method for referenceNum.
     *
     * @return the current value of referenceNum
     */
    public String getReferenceNum() {
        return referenceNum;
    }

    /**
     * Setter method for referenceNum.
     *
     * @param aReferenceNum the new value for referenceNum
     */
    public void setReferenceNum(String aReferenceNum) {
        referenceNum = aReferenceNum;
    }

    /**
     * Access method for natlTrstPassAddDate.
     *
     * @return the current value of natlTrstPassAddDate
     */
    public Timestamp getNatlTrstPassAddDate() {
        return natlTrstPassAddDate;
    }

    /**
     * Setter method for natlTrstPassAddDate.
     *
     * @param aNatlTrstPassAddDate the new value for natlTrstPassAddDate
     */
    public void setNatlTrstPassAddDate(Timestamp aNatlTrstPassAddDate) {
        natlTrstPassAddDate = aNatlTrstPassAddDate;
    }

    /**
     * Access method for natlTrstPassAddUsername.
     *
     * @return the current value of natlTrstPassAddUsername
     */
    public String getNatlTrstPassAddUsername() {
        return natlTrstPassAddUsername;
    }

    /**
     * Setter method for natlTrstPassAddUsername.
     *
     * @param aNatlTrstPassAddUsername the new value for natlTrstPassAddUsername
     */
    public void setNatlTrstPassAddUsername(String aNatlTrstPassAddUsername) {
        natlTrstPassAddUsername = aNatlTrstPassAddUsername;
    }

    /**
     * Access method for natlTrstPassUpdateDate.
     *
     * @return the current value of natlTrstPassUpdateDate
     */
    public Timestamp getNatlTrstPassUpdateDate() {
        return natlTrstPassUpdateDate;
    }

    /**
     * Setter method for natlTrstPassUpdateDate.
     *
     * @param aNatlTrstPassUpdateDate the new value for natlTrstPassUpdateDate
     */
    public void setNatlTrstPassUpdateDate(Timestamp aNatlTrstPassUpdateDate) {
        natlTrstPassUpdateDate = aNatlTrstPassUpdateDate;
    }

    /**
     * Access method for natlTrstPassUpdateUsername.
     *
     * @return the current value of natlTrstPassUpdateUsername
     */
    public String getNatlTrstPassUpdateUsername() {
        return natlTrstPassUpdateUsername;
    }

    /**
     * Setter method for natlTrstPassUpdateUsername.
     *
     * @param aNatlTrstPassUpdateUsername the new value for natlTrstPassUpdateUsername
     */
    public void setNatlTrstPassUpdateUsername(String aNatlTrstPassUpdateUsername) {
        natlTrstPassUpdateUsername = aNatlTrstPassUpdateUsername;
    }

    /**
     * Access method for fulfillmentChannel.
     *
     * @return the current value of fulfillmentChannel
     */
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    /**
     * Setter method for fulfillmentChannel.
     *
     * @param aFulfillmentChannel the new value for fulfillmentChannel
     */
    public void setFulfillmentChannel(String aFulfillmentChannel) {
        fulfillmentChannel = aFulfillmentChannel;
    }

    /**
     * Access method for cashBackSysid.
     *
     * @return the current value of cashBackSysid
     */
    public long getCashBackSysid() {
        return cashBackSysid;
    }

    /**
     * Setter method for cashBackSysid.
     *
     * @param aCashBackSysid the new value for cashBackSysid
     */
    public void setCashBackSysid(long aCashBackSysid) {
        cashBackSysid = aCashBackSysid;
    }

    /**
     * Access method for cashBackRuleId.
     *
     * @return the current value of cashBackRuleId
     */
    public BigDecimal getCashBackRuleId() {
        return cashBackRuleId;
    }

    /**
     * Setter method for cashBackRuleId.
     *
     * @param aCashBackRuleId the new value for cashBackRuleId
     */
    public void setCashBackRuleId(BigDecimal aCashBackRuleId) {
        cashBackRuleId = aCashBackRuleId;
    }

    /**
     * Access method for cashBackPaymentAmt.
     *
     * @return the current value of cashBackPaymentAmt
     */
    public BigDecimal getCashBackPaymentAmt() {
        return cashBackPaymentAmt;
    }

    /**
     * Setter method for cashBackPaymentAmt.
     *
     * @param aCashBackPaymentAmt the new value for cashBackPaymentAmt
     */
    public void setCashBackPaymentAmt(BigDecimal aCashBackPaymentAmt) {
        cashBackPaymentAmt = aCashBackPaymentAmt;
    }

    /**
     * Access method for cashBackTransactionAmt.
     *
     * @return the current value of cashBackTransactionAmt
     */
    public BigDecimal getCashBackTransactionAmt() {
        return cashBackTransactionAmt;
    }

    /**
     * Setter method for cashBackTransactionAmt.
     *
     * @param aCashBackTransactionAmt the new value for cashBackTransactionAmt
     */
    public void setCashBackTransactionAmt(BigDecimal aCashBackTransactionAmt) {
        cashBackTransactionAmt = aCashBackTransactionAmt;
    }

    /**
     * Access method for cashBackAddDate.
     *
     * @return the current value of cashBackAddDate
     */
    public Timestamp getCashBackAddDate() {
        return cashBackAddDate;
    }

    /**
     * Setter method for cashBackAddDate.
     *
     * @param aCashBackAddDate the new value for cashBackAddDate
     */
    public void setCashBackAddDate(Timestamp aCashBackAddDate) {
        cashBackAddDate = aCashBackAddDate;
    }

    /**
     * Access method for cashBackAddUsername.
     *
     * @return the current value of cashBackAddUsername
     */
    public String getCashBackAddUsername() {
        return cashBackAddUsername;
    }

    /**
     * Setter method for cashBackAddUsername.
     *
     * @param aCashBackAddUsername the new value for cashBackAddUsername
     */
    public void setCashBackAddUsername(String aCashBackAddUsername) {
        cashBackAddUsername = aCashBackAddUsername;
    }

    /**
     * Access method for cashBackUpdateDate.
     *
     * @return the current value of cashBackUpdateDate
     */
    public Timestamp getCashBackUpdateDate() {
        return cashBackUpdateDate;
    }

    /**
     * Setter method for cashBackUpdateDate.
     *
     * @param aCashBackUpdateDate the new value for cashBackUpdateDate
     */
    public void setCashBackUpdateDate(Timestamp aCashBackUpdateDate) {
        cashBackUpdateDate = aCashBackUpdateDate;
    }

    /**
     * Access method for cashBackUpdateUsername.
     *
     * @return the current value of cashBackUpdateUsername
     */
    public String getCashBackUpdateUsername() {
        return cashBackUpdateUsername;
    }

    /**
     * Setter method for cashBackUpdateUsername.
     *
     * @param aCashBackUpdateUsername the new value for cashBackUpdateUsername
     */
    public void setCashBackUpdateUsername(String aCashBackUpdateUsername) {
        cashBackUpdateUsername = aCashBackUpdateUsername;
    }

    /**
     * Access method for vendorName.
     *
     * @return the current value of vendorName
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Setter method for vendorName.
     *
     * @param aVendorName the new value for vendorName
     */
    public void setVendorName(String aVendorName) {
        vendorName = aVendorName;
    }

    /**
     * Access method for vendorId.
     *
     * @return the current value of vendorId
     */
    public long getVendorId() {
        return vendorId;
    }

    /**
     * Setter method for vendorId.
     *
     * @param aVendorId the new value for vendorId
     */
    public void setVendorId(long aVendorId) {
        vendorId = aVendorId;
    }

    /**
     * Access method for complaintSysid.
     *
     * @return the current value of complaintSysid
     */
    public long getComplaintSysid() {
        return complaintSysid;
    }

    /**
     * Setter method for complaintSysid.
     *
     * @param aComplaintSysid the new value for complaintSysid
     */
    public void setComplaintSysid(long aComplaintSysid) {
        complaintSysid = aComplaintSysid;
    }

    /**
     * Access method for lossDate.
     *
     * @return the current value of lossDate
     */
    public Timestamp getLossDate() {
        return lossDate;
    }

    /**
     * Setter method for lossDate.
     *
     * @param aLossDate the new value for lossDate
     */
    public void setLossDate(Timestamp aLossDate) {
        lossDate = aLossDate;
    }

    /**
     * Access method for placeOfLoss.
     *
     * @return the current value of placeOfLoss
     */
    public String getPlaceOfLoss() {
        return placeOfLoss;
    }

    /**
     * Setter method for placeOfLoss.
     *
     * @param aPlaceOfLoss the new value for placeOfLoss
     */
    public void setPlaceOfLoss(String aPlaceOfLoss) {
        placeOfLoss = aPlaceOfLoss;
    }

    /**
     * Access method for product.
     *
     * @return the current value of product
     */
    public String getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(String aProduct) {
        product = aProduct;
    }

    /**
     * Access method for reason.
     *
     * @return the current value of reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Setter method for reason.
     *
     * @param aReason the new value for reason
     */
    public void setReason(String aReason) {
        reason = aReason;
    }

    /**
     * Access method for compAmount.
     *
     * @return the current value of compAmount
     */
    public BigDecimal getCompAmount() {
        return compAmount;
    }

    /**
     * Setter method for compAmount.
     *
     * @param aCompAmount the new value for compAmount
     */
    public void setCompAmount(BigDecimal aCompAmount) {
        compAmount = aCompAmount;
    }

    /**
     * Access method for compAmountCurrency.
     *
     * @return the current value of compAmountCurrency
     */
    public String getCompAmountCurrency() {
        return compAmountCurrency;
    }

    /**
     * Setter method for compAmountCurrency.
     *
     * @param aCompAmountCurrency the new value for compAmountCurrency
     */
    public void setCompAmountCurrency(String aCompAmountCurrency) {
        compAmountCurrency = aCompAmountCurrency;
    }

    /**
     * Access method for benefitsExplained.
     *
     * @return the current value of benefitsExplained
     */
    public String getBenefitsExplained() {
        return benefitsExplained;
    }

    /**
     * Setter method for benefitsExplained.
     *
     * @param aBenefitsExplained the new value for benefitsExplained
     */
    public void setBenefitsExplained(String aBenefitsExplained) {
        benefitsExplained = aBenefitsExplained;
    }

    /**
     * Access method for detlNotExplained.
     *
     * @return the current value of detlNotExplained
     */
    public String getDetlNotExplained() {
        return detlNotExplained;
    }

    /**
     * Setter method for detlNotExplained.
     *
     * @param aDetlNotExplained the new value for detlNotExplained
     */
    public void setDetlNotExplained(String aDetlNotExplained) {
        detlNotExplained = aDetlNotExplained;
    }

    /**
     * Access method for exclHighlighted.
     *
     * @return the current value of exclHighlighted
     */
    public String getExclHighlighted() {
        return exclHighlighted;
    }

    /**
     * Setter method for exclHighlighted.
     *
     * @param aExclHighlighted the new value for exclHighlighted
     */
    public void setExclHighlighted(String aExclHighlighted) {
        exclHighlighted = aExclHighlighted;
    }

    /**
     * Access method for featExplained.
     *
     * @return the current value of featExplained
     */
    public String getFeatExplained() {
        return featExplained;
    }

    /**
     * Setter method for featExplained.
     *
     * @param aFeatExplained the new value for featExplained
     */
    public void setFeatExplained(String aFeatExplained) {
        featExplained = aFeatExplained;
    }

    /**
     * Access method for complaintAddDate.
     *
     * @return the current value of complaintAddDate
     */
    public Timestamp getComplaintAddDate() {
        return complaintAddDate;
    }

    /**
     * Setter method for complaintAddDate.
     *
     * @param aComplaintAddDate the new value for complaintAddDate
     */
    public void setComplaintAddDate(Timestamp aComplaintAddDate) {
        complaintAddDate = aComplaintAddDate;
    }

    /**
     * Access method for complaintAddUsername.
     *
     * @return the current value of complaintAddUsername
     */
    public String getComplaintAddUsername() {
        return complaintAddUsername;
    }

    /**
     * Setter method for complaintAddUsername.
     *
     * @param aComplaintAddUsername the new value for complaintAddUsername
     */
    public void setComplaintAddUsername(String aComplaintAddUsername) {
        complaintAddUsername = aComplaintAddUsername;
    }

    /**
     * Access method for complaintUpdateDate.
     *
     * @return the current value of complaintUpdateDate
     */
    public Timestamp getComplaintUpdateDate() {
        return complaintUpdateDate;
    }

    /**
     * Setter method for complaintUpdateDate.
     *
     * @param aComplaintUpdateDate the new value for complaintUpdateDate
     */
    public void setComplaintUpdateDate(Timestamp aComplaintUpdateDate) {
        complaintUpdateDate = aComplaintUpdateDate;
    }

    /**
     * Access method for complaintUpdateUsername.
     *
     * @return the current value of complaintUpdateUsername
     */
    public String getComplaintUpdateUsername() {
        return complaintUpdateUsername;
    }

    /**
     * Setter method for complaintUpdateUsername.
     *
     * @param aComplaintUpdateUsername the new value for complaintUpdateUsername
     */
    public void setComplaintUpdateUsername(String aComplaintUpdateUsername) {
        complaintUpdateUsername = aComplaintUpdateUsername;
    }

    /**
     * Access method for complainant.
     *
     * @return the current value of complainant
     */
    public String getComplainant() {
        return complainant;
    }

    /**
     * Setter method for complainant.
     *
     * @param aComplainant the new value for complainant
     */
    public void setComplainant(String aComplainant) {
        complainant = aComplainant;
    }

    /**
     * Access method for compensationType.
     *
     * @return the current value of compensationType
     */
    public String getCompensationType() {
        return compensationType;
    }

    /**
     * Setter method for compensationType.
     *
     * @param aCompensationType the new value for compensationType
     */
    public void setCompensationType(String aCompensationType) {
        compensationType = aCompensationType;
    }

    /**
     * Access method for receivedDateFromPartner.
     *
     * @return the current value of receivedDateFromPartner
     */
    public Timestamp getReceivedDateFromPartner() {
        return receivedDateFromPartner;
    }

    /**
     * Setter method for receivedDateFromPartner.
     *
     * @param aReceivedDateFromPartner the new value for receivedDateFromPartner
     */
    public void setReceivedDateFromPartner(Timestamp aReceivedDateFromPartner) {
        receivedDateFromPartner = aReceivedDateFromPartner;
    }

    /**
     * Access method for receivedBy.
     *
     * @return the current value of receivedBy
     */
    public String getReceivedBy() {
        return receivedBy;
    }

    /**
     * Setter method for receivedBy.
     *
     * @param aReceivedBy the new value for receivedBy
     */
    public void setReceivedBy(String aReceivedBy) {
        receivedBy = aReceivedBy;
    }

    /**
     * Access method for replyTo.
     *
     * @return the current value of replyTo
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Setter method for replyTo.
     *
     * @param aReplyTo the new value for replyTo
     */
    public void setReplyTo(String aReplyTo) {
        replyTo = aReplyTo;
    }

    /**
     * Access method for cbEvntBkngSysid.
     *
     * @return the current value of cbEvntBkngSysid
     */
    public long getCbEvntBkngSysid() {
        return cbEvntBkngSysid;
    }

    /**
     * Setter method for cbEvntBkngSysid.
     *
     * @param aCbEvntBkngSysid the new value for cbEvntBkngSysid
     */
    public void setCbEvntBkngSysid(long aCbEvntBkngSysid) {
        cbEvntBkngSysid = aCbEvntBkngSysid;
    }

    /**
     * Access method for entrtnmntEvntName.
     *
     * @return the current value of entrtnmntEvntName
     */
    public String getEntrtnmntEvntName() {
        return entrtnmntEvntName;
    }

    /**
     * Setter method for entrtnmntEvntName.
     *
     * @param aEntrtnmntEvntName the new value for entrtnmntEvntName
     */
    public void setEntrtnmntEvntName(String aEntrtnmntEvntName) {
        entrtnmntEvntName = aEntrtnmntEvntName;
    }

    /**
     * Access method for entrtnmntEvntDate.
     *
     * @return the current value of entrtnmntEvntDate
     */
    public Timestamp getEntrtnmntEvntDate() {
        return entrtnmntEvntDate;
    }

    /**
     * Setter method for entrtnmntEvntDate.
     *
     * @param aEntrtnmntEvntDate the new value for entrtnmntEvntDate
     */
    public void setEntrtnmntEvntDate(Timestamp aEntrtnmntEvntDate) {
        entrtnmntEvntDate = aEntrtnmntEvntDate;
    }

    /**
     * Access method for seatDetailsTxt.
     *
     * @return the current value of seatDetailsTxt
     */
    public String getSeatDetailsTxt() {
        return seatDetailsTxt;
    }

    /**
     * Setter method for seatDetailsTxt.
     *
     * @param aSeatDetailsTxt the new value for seatDetailsTxt
     */
    public void setSeatDetailsTxt(String aSeatDetailsTxt) {
        seatDetailsTxt = aSeatDetailsTxt;
    }

    /**
     * Access method for evntBkngCancelReasonDesc.
     *
     * @return the current value of evntBkngCancelReasonDesc
     */
    public String getEvntBkngCancelReasonDesc() {
        return evntBkngCancelReasonDesc;
    }

    /**
     * Setter method for evntBkngCancelReasonDesc.
     *
     * @param aEvntBkngCancelReasonDesc the new value for evntBkngCancelReasonDesc
     */
    public void setEvntBkngCancelReasonDesc(String aEvntBkngCancelReasonDesc) {
        evntBkngCancelReasonDesc = aEvntBkngCancelReasonDesc;
    }

    /**
     * Access method for evntBkngCancelReasonId.
     *
     * @return the current value of evntBkngCancelReasonId
     */
    public BigDecimal getEvntBkngCancelReasonId() {
        return evntBkngCancelReasonId;
    }

    /**
     * Setter method for evntBkngCancelReasonId.
     *
     * @param aEvntBkngCancelReasonId the new value for evntBkngCancelReasonId
     */
    public void setEvntBkngCancelReasonId(BigDecimal aEvntBkngCancelReasonId) {
        evntBkngCancelReasonId = aEvntBkngCancelReasonId;
    }

    /**
     * Access method for venueDesc.
     *
     * @return the current value of venueDesc
     */
    public String getVenueDesc() {
        return venueDesc;
    }

    /**
     * Setter method for venueDesc.
     *
     * @param aVenueDesc the new value for venueDesc
     */
    public void setVenueDesc(String aVenueDesc) {
        venueDesc = aVenueDesc;
    }

    /**
     * Access method for venueId.
     *
     * @return the current value of venueId
     */
    public BigDecimal getVenueId() {
        return venueId;
    }

    /**
     * Setter method for venueId.
     *
     * @param aVenueId the new value for venueId
     */
    public void setVenueId(BigDecimal aVenueId) {
        venueId = aVenueId;
    }

    /**
     * Access method for venueOtherName.
     *
     * @return the current value of venueOtherName
     */
    public String getVenueOtherName() {
        return venueOtherName;
    }

    /**
     * Setter method for venueOtherName.
     *
     * @param aVenueOtherName the new value for venueOtherName
     */
    public void setVenueOtherName(String aVenueOtherName) {
        venueOtherName = aVenueOtherName;
    }

    /**
     * Access method for eventBkngEmailTxt.
     *
     * @return the current value of eventBkngEmailTxt
     */
    public String getEventBkngEmailTxt() {
        return eventBkngEmailTxt;
    }

    /**
     * Setter method for eventBkngEmailTxt.
     *
     * @param aEventBkngEmailTxt the new value for eventBkngEmailTxt
     */
    public void setEventBkngEmailTxt(String aEventBkngEmailTxt) {
        eventBkngEmailTxt = aEventBkngEmailTxt;
    }

    /**
     * Access method for rqstCbEvtBookAddressSysid.
     *
     * @return the current value of rqstCbEvtBookAddressSysid
     */
    public long getRqstCbEvtBookAddressSysid() {
        return rqstCbEvtBookAddressSysid;
    }

    /**
     * Setter method for rqstCbEvtBookAddressSysid.
     *
     * @param aRqstCbEvtBookAddressSysid the new value for rqstCbEvtBookAddressSysid
     */
    public void setRqstCbEvtBookAddressSysid(long aRqstCbEvtBookAddressSysid) {
        rqstCbEvtBookAddressSysid = aRqstCbEvtBookAddressSysid;
    }

    /**
     * Access method for rqstCbEvtBookTicketDeliveryTypeDesc.
     *
     * @return the current value of rqstCbEvtBookTicketDeliveryTypeDesc
     */
    public String getRqstCbEvtBookTicketDeliveryTypeDesc() {
        return rqstCbEvtBookTicketDeliveryTypeDesc;
    }

    /**
     * Setter method for rqstCbEvtBookTicketDeliveryTypeDesc.
     *
     * @param aRqstCbEvtBookTicketDeliveryTypeDesc the new value for rqstCbEvtBookTicketDeliveryTypeDesc
     */
    public void setRqstCbEvtBookTicketDeliveryTypeDesc(String aRqstCbEvtBookTicketDeliveryTypeDesc) {
        rqstCbEvtBookTicketDeliveryTypeDesc = aRqstCbEvtBookTicketDeliveryTypeDesc;
    }

    /**
     * Access method for rqstCbEvtBookTicketDeliveryTypeId.
     *
     * @return the current value of rqstCbEvtBookTicketDeliveryTypeId
     */
    public BigDecimal getRqstCbEvtBookTicketDeliveryTypeId() {
        return rqstCbEvtBookTicketDeliveryTypeId;
    }

    /**
     * Setter method for rqstCbEvtBookTicketDeliveryTypeId.
     *
     * @param aRqstCbEvtBookTicketDeliveryTypeId the new value for rqstCbEvtBookTicketDeliveryTypeId
     */
    public void setRqstCbEvtBookTicketDeliveryTypeId(BigDecimal aRqstCbEvtBookTicketDeliveryTypeId) {
        rqstCbEvtBookTicketDeliveryTypeId = aRqstCbEvtBookTicketDeliveryTypeId;
    }

    /**
     * Access method for rqstCbEvtBookTicketProviderDesc.
     *
     * @return the current value of rqstCbEvtBookTicketProviderDesc
     */
    public String getRqstCbEvtBookTicketProviderDesc() {
        return rqstCbEvtBookTicketProviderDesc;
    }

    /**
     * Setter method for rqstCbEvtBookTicketProviderDesc.
     *
     * @param aRqstCbEvtBookTicketProviderDesc the new value for rqstCbEvtBookTicketProviderDesc
     */
    public void setRqstCbEvtBookTicketProviderDesc(String aRqstCbEvtBookTicketProviderDesc) {
        rqstCbEvtBookTicketProviderDesc = aRqstCbEvtBookTicketProviderDesc;
    }

    /**
     * Access method for rqstCbEvtBookTicketProviderId.
     *
     * @return the current value of rqstCbEvtBookTicketProviderId
     */
    public BigDecimal getRqstCbEvtBookTicketProviderId() {
        return rqstCbEvtBookTicketProviderId;
    }

    /**
     * Setter method for rqstCbEvtBookTicketProviderId.
     *
     * @param aRqstCbEvtBookTicketProviderId the new value for rqstCbEvtBookTicketProviderId
     */
    public void setRqstCbEvtBookTicketProviderId(BigDecimal aRqstCbEvtBookTicketProviderId) {
        rqstCbEvtBookTicketProviderId = aRqstCbEvtBookTicketProviderId;
    }

    /**
     * Access method for bkngRefrncNr.
     *
     * @return the current value of bkngRefrncNr
     */
    public String getBkngRefrncNr() {
        return bkngRefrncNr;
    }

    /**
     * Setter method for bkngRefrncNr.
     *
     * @param aBkngRefrncNr the new value for bkngRefrncNr
     */
    public void setBkngRefrncNr(String aBkngRefrncNr) {
        bkngRefrncNr = aBkngRefrncNr;
    }

    /**
     * Access method for postageAmt.
     *
     * @return the current value of postageAmt
     */
    public BigDecimal getPostageAmt() {
        return postageAmt;
    }

    /**
     * Setter method for postageAmt.
     *
     * @param aPostageAmt the new value for postageAmt
     */
    public void setPostageAmt(BigDecimal aPostageAmt) {
        postageAmt = aPostageAmt;
    }

    /**
     * Access method for totalBkngFeeAmt.
     *
     * @return the current value of totalBkngFeeAmt
     */
    public BigDecimal getTotalBkngFeeAmt() {
        return totalBkngFeeAmt;
    }

    /**
     * Setter method for totalBkngFeeAmt.
     *
     * @param aTotalBkngFeeAmt the new value for totalBkngFeeAmt
     */
    public void setTotalBkngFeeAmt(BigDecimal aTotalBkngFeeAmt) {
        totalBkngFeeAmt = aTotalBkngFeeAmt;
    }

    /**
     * Access method for totalPriceAmt.
     *
     * @return the current value of totalPriceAmt
     */
    public BigDecimal getTotalPriceAmt() {
        return totalPriceAmt;
    }

    /**
     * Setter method for totalPriceAmt.
     *
     * @param aTotalPriceAmt the new value for totalPriceAmt
     */
    public void setTotalPriceAmt(BigDecimal aTotalPriceAmt) {
        totalPriceAmt = aTotalPriceAmt;
    }

    /**
     * Access method for totalPriceAfterCbAmt.
     *
     * @return the current value of totalPriceAfterCbAmt
     */
    public BigDecimal getTotalPriceAfterCbAmt() {
        return totalPriceAfterCbAmt;
    }

    /**
     * Setter method for totalPriceAfterCbAmt.
     *
     * @param aTotalPriceAfterCbAmt the new value for totalPriceAfterCbAmt
     */
    public void setTotalPriceAfterCbAmt(BigDecimal aTotalPriceAfterCbAmt) {
        totalPriceAfterCbAmt = aTotalPriceAfterCbAmt;
    }

    /**
     * Access method for totalCbAmt.
     *
     * @return the current value of totalCbAmt
     */
    public BigDecimal getTotalCbAmt() {
        return totalCbAmt;
    }

    /**
     * Setter method for totalCbAmt.
     *
     * @param aTotalCbAmt the new value for totalCbAmt
     */
    public void setTotalCbAmt(BigDecimal aTotalCbAmt) {
        totalCbAmt = aTotalCbAmt;
    }

    /**
     * Access method for rqstCbEvtBookTotalTicketQty.
     *
     * @return the current value of rqstCbEvtBookTotalTicketQty
     */
    public BigDecimal getRqstCbEvtBookTotalTicketQty() {
        return rqstCbEvtBookTotalTicketQty;
    }

    /**
     * Setter method for rqstCbEvtBookTotalTicketQty.
     *
     * @param aRqstCbEvtBookTotalTicketQty the new value for rqstCbEvtBookTotalTicketQty
     */
    public void setRqstCbEvtBookTotalTicketQty(BigDecimal aRqstCbEvtBookTotalTicketQty) {
        rqstCbEvtBookTotalTicketQty = aRqstCbEvtBookTotalTicketQty;
    }

    /**
     * Access method for cbIneligibleFl.
     *
     * @return the current value of cbIneligibleFl
     */
    public BigDecimal getCbIneligibleFl() {
        return cbIneligibleFl;
    }

    /**
     * Setter method for cbIneligibleFl.
     *
     * @param aCbIneligibleFl the new value for cbIneligibleFl
     */
    public void setCbIneligibleFl(BigDecimal aCbIneligibleFl) {
        cbIneligibleFl = aCbIneligibleFl;
    }

    /**
     * Access method for rqstCbEvtBookAddDate.
     *
     * @return the current value of rqstCbEvtBookAddDate
     */
    public Timestamp getRqstCbEvtBookAddDate() {
        return rqstCbEvtBookAddDate;
    }

    /**
     * Setter method for rqstCbEvtBookAddDate.
     *
     * @param aRqstCbEvtBookAddDate the new value for rqstCbEvtBookAddDate
     */
    public void setRqstCbEvtBookAddDate(Timestamp aRqstCbEvtBookAddDate) {
        rqstCbEvtBookAddDate = aRqstCbEvtBookAddDate;
    }

    /**
     * Access method for rqstCbEvtBookAddUsername.
     *
     * @return the current value of rqstCbEvtBookAddUsername
     */
    public String getRqstCbEvtBookAddUsername() {
        return rqstCbEvtBookAddUsername;
    }

    /**
     * Setter method for rqstCbEvtBookAddUsername.
     *
     * @param aRqstCbEvtBookAddUsername the new value for rqstCbEvtBookAddUsername
     */
    public void setRqstCbEvtBookAddUsername(String aRqstCbEvtBookAddUsername) {
        rqstCbEvtBookAddUsername = aRqstCbEvtBookAddUsername;
    }

    /**
     * Access method for rqstCbEvtBookUpdateDate.
     *
     * @return the current value of rqstCbEvtBookUpdateDate
     */
    public Timestamp getRqstCbEvtBookUpdateDate() {
        return rqstCbEvtBookUpdateDate;
    }

    /**
     * Setter method for rqstCbEvtBookUpdateDate.
     *
     * @param aRqstCbEvtBookUpdateDate the new value for rqstCbEvtBookUpdateDate
     */
    public void setRqstCbEvtBookUpdateDate(Timestamp aRqstCbEvtBookUpdateDate) {
        rqstCbEvtBookUpdateDate = aRqstCbEvtBookUpdateDate;
    }

    /**
     * Access method for rqstCbEvtBookUpdateUsername.
     *
     * @return the current value of rqstCbEvtBookUpdateUsername
     */
    public String getRqstCbEvtBookUpdateUsername() {
        return rqstCbEvtBookUpdateUsername;
    }

    /**
     * Setter method for rqstCbEvtBookUpdateUsername.
     *
     * @param aRqstCbEvtBookUpdateUsername the new value for rqstCbEvtBookUpdateUsername
     */
    public void setRqstCbEvtBookUpdateUsername(String aRqstCbEvtBookUpdateUsername) {
        rqstCbEvtBookUpdateUsername = aRqstCbEvtBookUpdateUsername;
    }

    /**
     * Access method for evntCatgryId.
     *
     * @return the current value of evntCatgryId
     */
    public BigDecimal getEvntCatgryId() {
        return evntCatgryId;
    }

    /**
     * Setter method for evntCatgryId.
     *
     * @param aEvntCatgryId the new value for evntCatgryId
     */
    public void setEvntCatgryId(BigDecimal aEvntCatgryId) {
        evntCatgryId = aEvntCatgryId;
    }

    /**
     * Access method for venueCityId.
     *
     * @return the current value of venueCityId
     */
    public BigDecimal getVenueCityId() {
        return venueCityId;
    }

    /**
     * Setter method for venueCityId.
     *
     * @param aVenueCityId the new value for venueCityId
     */
    public void setVenueCityId(BigDecimal aVenueCityId) {
        venueCityId = aVenueCityId;
    }

    /**
     * Access method for extraCashbackPctDesc.
     *
     * @return the current value of extraCashbackPctDesc
     */
    public String getExtraCashbackPctDesc() {
        return extraCashbackPctDesc;
    }

    /**
     * Setter method for extraCashbackPctDesc.
     *
     * @param aExtraCashbackPctDesc the new value for extraCashbackPctDesc
     */
    public void setExtraCashbackPctDesc(String aExtraCashbackPctDesc) {
        extraCashbackPctDesc = aExtraCashbackPctDesc;
    }

    /**
     * Access method for extraCashbackPctId.
     *
     * @return the current value of extraCashbackPctId
     */
    public BigDecimal getExtraCashbackPctId() {
        return extraCashbackPctId;
    }

    /**
     * Setter method for extraCashbackPctId.
     *
     * @param aExtraCashbackPctId the new value for extraCashbackPctId
     */
    public void setExtraCashbackPctId(BigDecimal aExtraCashbackPctId) {
        extraCashbackPctId = aExtraCashbackPctId;
    }

    /**
     * Access method for cbLastBookingFl.
     *
     * @return the current value of cbLastBookingFl
     */
    public BigDecimal getCbLastBookingFl() {
        return cbLastBookingFl;
    }

    /**
     * Setter method for cbLastBookingFl.
     *
     * @param aCbLastBookingFl the new value for cbLastBookingFl
     */
    public void setCbLastBookingFl(BigDecimal aCbLastBookingFl) {
        cbLastBookingFl = aCbLastBookingFl;
    }

    /**
     * Access method for extraCbAmt.
     *
     * @return the current value of extraCbAmt
     */
    public BigDecimal getExtraCbAmt() {
        return extraCbAmt;
    }

    /**
     * Setter method for extraCbAmt.
     *
     * @param aExtraCbAmt the new value for extraCbAmt
     */
    public void setExtraCbAmt(BigDecimal aExtraCbAmt) {
        extraCbAmt = aExtraCbAmt;
    }

    /**
     * Access method for currencyConversionId.
     *
     * @return the current value of currencyConversionId
     */
    public BigDecimal getCurrencyConversionId() {
        return currencyConversionId;
    }

    /**
     * Setter method for currencyConversionId.
     *
     * @param aCurrencyConversionId the new value for currencyConversionId
     */
    public void setCurrencyConversionId(BigDecimal aCurrencyConversionId) {
        currencyConversionId = aCurrencyConversionId;
    }

    /**
     * Access method for purchaseDate.
     *
     * @return the current value of purchaseDate
     */
    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Setter method for purchaseDate.
     *
     * @param aPurchaseDate the new value for purchaseDate
     */
    public void setPurchaseDate(Timestamp aPurchaseDate) {
        purchaseDate = aPurchaseDate;
    }

    /**
     * Access method for rqstCbEvtBookDeliveryName.
     *
     * @return the current value of rqstCbEvtBookDeliveryName
     */
    public String getRqstCbEvtBookDeliveryName() {
        return rqstCbEvtBookDeliveryName;
    }

    /**
     * Setter method for rqstCbEvtBookDeliveryName.
     *
     * @param aRqstCbEvtBookDeliveryName the new value for rqstCbEvtBookDeliveryName
     */
    public void setRqstCbEvtBookDeliveryName(String aRqstCbEvtBookDeliveryName) {
        rqstCbEvtBookDeliveryName = aRqstCbEvtBookDeliveryName;
    }

    /**
     * Access method for bookingDate.
     *
     * @return the current value of bookingDate
     */
    public Timestamp getBookingDate() {
        return bookingDate;
    }

    /**
     * Setter method for bookingDate.
     *
     * @param aBookingDate the new value for bookingDate
     */
    public void setBookingDate(Timestamp aBookingDate) {
        bookingDate = aBookingDate;
    }

    /**
     * Access method for evntCatgryName.
     *
     * @return the current value of evntCatgryName
     */
    public String getEvntCatgryName() {
        return evntCatgryName;
    }

    /**
     * Setter method for evntCatgryName.
     *
     * @param aEvntCatgryName the new value for evntCatgryName
     */
    public void setEvntCatgryName(String aEvntCatgryName) {
        evntCatgryName = aEvntCatgryName;
    }

    /**
     * Access method for rqstCbEvtBookSourceOrderRef.
     *
     * @return the current value of rqstCbEvtBookSourceOrderRef
     */
    public String getRqstCbEvtBookSourceOrderRef() {
        return rqstCbEvtBookSourceOrderRef;
    }

    /**
     * Setter method for rqstCbEvtBookSourceOrderRef.
     *
     * @param aRqstCbEvtBookSourceOrderRef the new value for rqstCbEvtBookSourceOrderRef
     */
    public void setRqstCbEvtBookSourceOrderRef(String aRqstCbEvtBookSourceOrderRef) {
        rqstCbEvtBookSourceOrderRef = aRqstCbEvtBookSourceOrderRef;
    }

    /**
     * Access method for venueCity.
     *
     * @return the current value of venueCity
     */
    public String getVenueCity() {
        return venueCity;
    }

    /**
     * Setter method for venueCity.
     *
     * @param aVenueCity the new value for venueCity
     */
    public void setVenueCity(String aVenueCity) {
        venueCity = aVenueCity;
    }

    /**
     * Access method for rqstCbEvtBookVendorEventRef.
     *
     * @return the current value of rqstCbEvtBookVendorEventRef
     */
    public String getRqstCbEvtBookVendorEventRef() {
        return rqstCbEvtBookVendorEventRef;
    }

    /**
     * Setter method for rqstCbEvtBookVendorEventRef.
     *
     * @param aRqstCbEvtBookVendorEventRef the new value for rqstCbEvtBookVendorEventRef
     */
    public void setRqstCbEvtBookVendorEventRef(String aRqstCbEvtBookVendorEventRef) {
        rqstCbEvtBookVendorEventRef = aRqstCbEvtBookVendorEventRef;
    }

    /**
     * Access method for rqstCbEvtBookPreregistrationFl.
     *
     * @return the current value of rqstCbEvtBookPreregistrationFl
     */
    public BigDecimal getRqstCbEvtBookPreregistrationFl() {
        return rqstCbEvtBookPreregistrationFl;
    }

    /**
     * Setter method for rqstCbEvtBookPreregistrationFl.
     *
     * @param aRqstCbEvtBookPreregistrationFl the new value for rqstCbEvtBookPreregistrationFl
     */
    public void setRqstCbEvtBookPreregistrationFl(BigDecimal aRqstCbEvtBookPreregistrationFl) {
        rqstCbEvtBookPreregistrationFl = aRqstCbEvtBookPreregistrationFl;
    }

    /**
     * Access method for address1.
     *
     * @return the current value of address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Setter method for address1.
     *
     * @param aAddress1 the new value for address1
     */
    public void setAddress1(String aAddress1) {
        address1 = aAddress1;
    }

    /**
     * Access method for address2.
     *
     * @return the current value of address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Setter method for address2.
     *
     * @param aAddress2 the new value for address2
     */
    public void setAddress2(String aAddress2) {
        address2 = aAddress2;
    }

    /**
     * Access method for address3.
     *
     * @return the current value of address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Setter method for address3.
     *
     * @param aAddress3 the new value for address3
     */
    public void setAddress3(String aAddress3) {
        address3 = aAddress3;
    }

    /**
     * Access method for city.
     *
     * @return the current value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for city.
     *
     * @param aCity the new value for city
     */
    public void setCity(String aCity) {
        city = aCity;
    }

    /**
     * Access method for county.
     *
     * @return the current value of county
     */
    public String getCounty() {
        return county;
    }

    /**
     * Setter method for county.
     *
     * @param aCounty the new value for county
     */
    public void setCounty(String aCounty) {
        county = aCounty;
    }

    /**
     * Access method for postalCode.
     *
     * @return the current value of postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter method for postalCode.
     *
     * @param aPostalCode the new value for postalCode
     */
    public void setPostalCode(String aPostalCode) {
        postalCode = aPostalCode;
    }

    /**
     * Access method for country.
     *
     * @return the current value of country
     */
    public BigDecimal getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(BigDecimal aCountry) {
        country = aCountry;
    }

    /**
     * Access method for phoneNum.
     *
     * @return the current value of phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Setter method for phoneNum.
     *
     * @param aPhoneNum the new value for phoneNum
     */
    public void setPhoneNum(String aPhoneNum) {
        phoneNum = aPhoneNum;
    }

    /**
     * Access method for phoneNum2.
     *
     * @return the current value of phoneNum2
     */
    public String getPhoneNum2() {
        return phoneNum2;
    }

    /**
     * Setter method for phoneNum2.
     *
     * @param aPhoneNum2 the new value for phoneNum2
     */
    public void setPhoneNum2(String aPhoneNum2) {
        phoneNum2 = aPhoneNum2;
    }

    /**
     * Access method for mobileNum.
     *
     * @return the current value of mobileNum
     */
    public String getMobileNum() {
        return mobileNum;
    }

    /**
     * Setter method for mobileNum.
     *
     * @param aMobileNum the new value for mobileNum
     */
    public void setMobileNum(String aMobileNum) {
        mobileNum = aMobileNum;
    }

    /**
     * Access method for addressAddDate.
     *
     * @return the current value of addressAddDate
     */
    public Timestamp getAddressAddDate() {
        return addressAddDate;
    }

    /**
     * Setter method for addressAddDate.
     *
     * @param aAddressAddDate the new value for addressAddDate
     */
    public void setAddressAddDate(Timestamp aAddressAddDate) {
        addressAddDate = aAddressAddDate;
    }

    /**
     * Access method for addressAddUsername.
     *
     * @return the current value of addressAddUsername
     */
    public String getAddressAddUsername() {
        return addressAddUsername;
    }

    /**
     * Setter method for addressAddUsername.
     *
     * @param aAddressAddUsername the new value for addressAddUsername
     */
    public void setAddressAddUsername(String aAddressAddUsername) {
        addressAddUsername = aAddressAddUsername;
    }

    /**
     * Access method for addressUpdateDate.
     *
     * @return the current value of addressUpdateDate
     */
    public Timestamp getAddressUpdateDate() {
        return addressUpdateDate;
    }

    /**
     * Setter method for addressUpdateDate.
     *
     * @param aAddressUpdateDate the new value for addressUpdateDate
     */
    public void setAddressUpdateDate(Timestamp aAddressUpdateDate) {
        addressUpdateDate = aAddressUpdateDate;
    }

    /**
     * Access method for addressUpdateUsername.
     *
     * @return the current value of addressUpdateUsername
     */
    public String getAddressUpdateUsername() {
        return addressUpdateUsername;
    }

    /**
     * Setter method for addressUpdateUsername.
     *
     * @param aAddressUpdateUsername the new value for addressUpdateUsername
     */
    public void setAddressUpdateUsername(String aAddressUpdateUsername) {
        addressUpdateUsername = aAddressUpdateUsername;
    }

    /**
     * Access method for onsaleRegEvtBkngId.
     *
     * @return the current value of onsaleRegEvtBkngId
     */
    public long getOnsaleRegEvtBkngId() {
        return onsaleRegEvtBkngId;
    }

    /**
     * Setter method for onsaleRegEvtBkngId.
     *
     * @param aOnsaleRegEvtBkngId the new value for onsaleRegEvtBkngId
     */
    public void setOnsaleRegEvtBkngId(long aOnsaleRegEvtBkngId) {
        onsaleRegEvtBkngId = aOnsaleRegEvtBkngId;
    }

    /**
     * Access method for bookingRequestId.
     *
     * @return the current value of bookingRequestId
     */
    public long getBookingRequestId() {
        return bookingRequestId;
    }

    /**
     * Setter method for bookingRequestId.
     *
     * @param aBookingRequestId the new value for bookingRequestId
     */
    public void setBookingRequestId(long aBookingRequestId) {
        bookingRequestId = aBookingRequestId;
    }

    /**
     * Access method for regEvtBkngAddressId.
     *
     * @return the current value of regEvtBkngAddressId
     */
    public long getRegEvtBkngAddressId() {
        return regEvtBkngAddressId;
    }

    /**
     * Setter method for regEvtBkngAddressId.
     *
     * @param aRegEvtBkngAddressId the new value for regEvtBkngAddressId
     */
    public void setRegEvtBkngAddressId(long aRegEvtBkngAddressId) {
        regEvtBkngAddressId = aRegEvtBkngAddressId;
    }

    /**
     * Access method for regEvtBkngDeliveryName.
     *
     * @return the current value of regEvtBkngDeliveryName
     */
    public String getRegEvtBkngDeliveryName() {
        return regEvtBkngDeliveryName;
    }

    /**
     * Setter method for regEvtBkngDeliveryName.
     *
     * @param aRegEvtBkngDeliveryName the new value for regEvtBkngDeliveryName
     */
    public void setRegEvtBkngDeliveryName(String aRegEvtBkngDeliveryName) {
        regEvtBkngDeliveryName = aRegEvtBkngDeliveryName;
    }

    /**
     * Access method for regEvtBkngTicketProvider.
     *
     * @return the current value of regEvtBkngTicketProvider
     */
    public String getRegEvtBkngTicketProvider() {
        return regEvtBkngTicketProvider;
    }

    /**
     * Setter method for regEvtBkngTicketProvider.
     *
     * @param aRegEvtBkngTicketProvider the new value for regEvtBkngTicketProvider
     */
    public void setRegEvtBkngTicketProvider(String aRegEvtBkngTicketProvider) {
        regEvtBkngTicketProvider = aRegEvtBkngTicketProvider;
    }

    /**
     * Access method for regEvtBkngEvntName.
     *
     * @return the current value of regEvtBkngEvntName
     */
    public String getRegEvtBkngEvntName() {
        return regEvtBkngEvntName;
    }

    /**
     * Setter method for regEvtBkngEvntName.
     *
     * @param aRegEvtBkngEvntName the new value for regEvtBkngEvntName
     */
    public void setRegEvtBkngEvntName(String aRegEvtBkngEvntName) {
        regEvtBkngEvntName = aRegEvtBkngEvntName;
    }

    /**
     * Access method for regEvtBkngVendorEventRef.
     *
     * @return the current value of regEvtBkngVendorEventRef
     */
    public String getRegEvtBkngVendorEventRef() {
        return regEvtBkngVendorEventRef;
    }

    /**
     * Setter method for regEvtBkngVendorEventRef.
     *
     * @param aRegEvtBkngVendorEventRef the new value for regEvtBkngVendorEventRef
     */
    public void setRegEvtBkngVendorEventRef(String aRegEvtBkngVendorEventRef) {
        regEvtBkngVendorEventRef = aRegEvtBkngVendorEventRef;
    }

    /**
     * Access method for evntOnsaleDate.
     *
     * @return the current value of evntOnsaleDate
     */
    public Timestamp getEvntOnsaleDate() {
        return evntOnsaleDate;
    }

    /**
     * Setter method for evntOnsaleDate.
     *
     * @param aEvntOnsaleDate the new value for evntOnsaleDate
     */
    public void setEvntOnsaleDate(Timestamp aEvntOnsaleDate) {
        evntOnsaleDate = aEvntOnsaleDate;
    }

    /**
     * Access method for evntCategoryId.
     *
     * @return the current value of evntCategoryId
     */
    public String getEvntCategoryId() {
        return evntCategoryId;
    }

    /**
     * Setter method for evntCategoryId.
     *
     * @param aEvntCategoryId the new value for evntCategoryId
     */
    public void setEvntCategoryId(String aEvntCategoryId) {
        evntCategoryId = aEvntCategoryId;
    }

    /**
     * Access method for evntCategoryName.
     *
     * @return the current value of evntCategoryName
     */
    public String getEvntCategoryName() {
        return evntCategoryName;
    }

    /**
     * Setter method for evntCategoryName.
     *
     * @param aEvntCategoryName the new value for evntCategoryName
     */
    public void setEvntCategoryName(String aEvntCategoryName) {
        evntCategoryName = aEvntCategoryName;
    }

    /**
     * Access method for evntBkngEmailTxt.
     *
     * @return the current value of evntBkngEmailTxt
     */
    public String getEvntBkngEmailTxt() {
        return evntBkngEmailTxt;
    }

    /**
     * Setter method for evntBkngEmailTxt.
     *
     * @param aEvntBkngEmailTxt the new value for evntBkngEmailTxt
     */
    public void setEvntBkngEmailTxt(String aEvntBkngEmailTxt) {
        evntBkngEmailTxt = aEvntBkngEmailTxt;
    }

    /**
     * Access method for evntBkngCancelReason.
     *
     * @return the current value of evntBkngCancelReason
     */
    public String getEvntBkngCancelReason() {
        return evntBkngCancelReason;
    }

    /**
     * Setter method for evntBkngCancelReason.
     *
     * @param aEvntBkngCancelReason the new value for evntBkngCancelReason
     */
    public void setEvntBkngCancelReason(String aEvntBkngCancelReason) {
        evntBkngCancelReason = aEvntBkngCancelReason;
    }

    /**
     * Access method for regEvtBkngPreregistrationFl.
     *
     * @return the current value of regEvtBkngPreregistrationFl
     */
    public BigDecimal getRegEvtBkngPreregistrationFl() {
        return regEvtBkngPreregistrationFl;
    }

    /**
     * Setter method for regEvtBkngPreregistrationFl.
     *
     * @param aRegEvtBkngPreregistrationFl the new value for regEvtBkngPreregistrationFl
     */
    public void setRegEvtBkngPreregistrationFl(BigDecimal aRegEvtBkngPreregistrationFl) {
        regEvtBkngPreregistrationFl = aRegEvtBkngPreregistrationFl;
    }

    /**
     * Access method for regEvtBkngTotalTicketsQty.
     *
     * @return the current value of regEvtBkngTotalTicketsQty
     */
    public BigDecimal getRegEvtBkngTotalTicketsQty() {
        return regEvtBkngTotalTicketsQty;
    }

    /**
     * Setter method for regEvtBkngTotalTicketsQty.
     *
     * @param aRegEvtBkngTotalTicketsQty the new value for regEvtBkngTotalTicketsQty
     */
    public void setRegEvtBkngTotalTicketsQty(BigDecimal aRegEvtBkngTotalTicketsQty) {
        regEvtBkngTotalTicketsQty = aRegEvtBkngTotalTicketsQty;
    }

    /**
     * Access method for regEvtBkngTicketDeliveryType.
     *
     * @return the current value of regEvtBkngTicketDeliveryType
     */
    public String getRegEvtBkngTicketDeliveryType() {
        return regEvtBkngTicketDeliveryType;
    }

    /**
     * Setter method for regEvtBkngTicketDeliveryType.
     *
     * @param aRegEvtBkngTicketDeliveryType the new value for regEvtBkngTicketDeliveryType
     */
    public void setRegEvtBkngTicketDeliveryType(String aRegEvtBkngTicketDeliveryType) {
        regEvtBkngTicketDeliveryType = aRegEvtBkngTicketDeliveryType;
    }

    /**
     * Access method for ticketCurrency.
     *
     * @return the current value of ticketCurrency
     */
    public String getTicketCurrency() {
        return ticketCurrency;
    }

    /**
     * Setter method for ticketCurrency.
     *
     * @param aTicketCurrency the new value for ticketCurrency
     */
    public void setTicketCurrency(String aTicketCurrency) {
        ticketCurrency = aTicketCurrency;
    }

    /**
     * Access method for minTicketPrice.
     *
     * @return the current value of minTicketPrice
     */
    public BigDecimal getMinTicketPrice() {
        return minTicketPrice;
    }

    /**
     * Setter method for minTicketPrice.
     *
     * @param aMinTicketPrice the new value for minTicketPrice
     */
    public void setMinTicketPrice(BigDecimal aMinTicketPrice) {
        minTicketPrice = aMinTicketPrice;
    }

    /**
     * Access method for maxTicketPrice.
     *
     * @return the current value of maxTicketPrice
     */
    public BigDecimal getMaxTicketPrice() {
        return maxTicketPrice;
    }

    /**
     * Setter method for maxTicketPrice.
     *
     * @param aMaxTicketPrice the new value for maxTicketPrice
     */
    public void setMaxTicketPrice(BigDecimal aMaxTicketPrice) {
        maxTicketPrice = aMaxTicketPrice;
    }

    /**
     * Access method for prefTicketPrice.
     *
     * @return the current value of prefTicketPrice
     */
    public BigDecimal getPrefTicketPrice() {
        return prefTicketPrice;
    }

    /**
     * Setter method for prefTicketPrice.
     *
     * @param aPrefTicketPrice the new value for prefTicketPrice
     */
    public void setPrefTicketPrice(BigDecimal aPrefTicketPrice) {
        prefTicketPrice = aPrefTicketPrice;
    }

    /**
     * Access method for possiblePerformances.
     *
     * @return the current value of possiblePerformances
     */
    public String getPossiblePerformances() {
        return possiblePerformances;
    }

    /**
     * Setter method for possiblePerformances.
     *
     * @param aPossiblePerformances the new value for possiblePerformances
     */
    public void setPossiblePerformances(String aPossiblePerformances) {
        possiblePerformances = aPossiblePerformances;
    }

    /**
     * Access method for specialReqs.
     *
     * @return the current value of specialReqs
     */
    public String getSpecialReqs() {
        return specialReqs;
    }

    /**
     * Setter method for specialReqs.
     *
     * @param aSpecialReqs the new value for specialReqs
     */
    public void setSpecialReqs(String aSpecialReqs) {
        specialReqs = aSpecialReqs;
    }

    /**
     * Access method for preferenceNotes.
     *
     * @return the current value of preferenceNotes
     */
    public String getPreferenceNotes() {
        return preferenceNotes;
    }

    /**
     * Setter method for preferenceNotes.
     *
     * @param aPreferenceNotes the new value for preferenceNotes
     */
    public void setPreferenceNotes(String aPreferenceNotes) {
        preferenceNotes = aPreferenceNotes;
    }

    /**
     * Access method for regEvtBkngUserCreated.
     *
     * @return the current value of regEvtBkngUserCreated
     */
    public String getRegEvtBkngUserCreated() {
        return regEvtBkngUserCreated;
    }

    /**
     * Setter method for regEvtBkngUserCreated.
     *
     * @param aRegEvtBkngUserCreated the new value for regEvtBkngUserCreated
     */
    public void setRegEvtBkngUserCreated(String aRegEvtBkngUserCreated) {
        regEvtBkngUserCreated = aRegEvtBkngUserCreated;
    }

    /**
     * Access method for regEvtBkngDateCreated.
     *
     * @return the current value of regEvtBkngDateCreated
     */
    public Timestamp getRegEvtBkngDateCreated() {
        return regEvtBkngDateCreated;
    }

    /**
     * Setter method for regEvtBkngDateCreated.
     *
     * @param aRegEvtBkngDateCreated the new value for regEvtBkngDateCreated
     */
    public void setRegEvtBkngDateCreated(Timestamp aRegEvtBkngDateCreated) {
        regEvtBkngDateCreated = aRegEvtBkngDateCreated;
    }

    /**
     * Access method for regEvtBkngUserModified.
     *
     * @return the current value of regEvtBkngUserModified
     */
    public String getRegEvtBkngUserModified() {
        return regEvtBkngUserModified;
    }

    /**
     * Setter method for regEvtBkngUserModified.
     *
     * @param aRegEvtBkngUserModified the new value for regEvtBkngUserModified
     */
    public void setRegEvtBkngUserModified(String aRegEvtBkngUserModified) {
        regEvtBkngUserModified = aRegEvtBkngUserModified;
    }

    /**
     * Access method for regEvtBkngDateModified.
     *
     * @return the current value of regEvtBkngDateModified
     */
    public Timestamp getRegEvtBkngDateModified() {
        return regEvtBkngDateModified;
    }

    /**
     * Setter method for regEvtBkngDateModified.
     *
     * @param aRegEvtBkngDateModified the new value for regEvtBkngDateModified
     */
    public void setRegEvtBkngDateModified(Timestamp aRegEvtBkngDateModified) {
        regEvtBkngDateModified = aRegEvtBkngDateModified;
    }

    /**
     * Access method for onsaleRegEvtBkngPrefId.
     *
     * @return the current value of onsaleRegEvtBkngPrefId
     */
    public long getOnsaleRegEvtBkngPrefId() {
        return onsaleRegEvtBkngPrefId;
    }

    /**
     * Setter method for onsaleRegEvtBkngPrefId.
     *
     * @param aOnsaleRegEvtBkngPrefId the new value for onsaleRegEvtBkngPrefId
     */
    public void setOnsaleRegEvtBkngPrefId(long aOnsaleRegEvtBkngPrefId) {
        onsaleRegEvtBkngPrefId = aOnsaleRegEvtBkngPrefId;
    }

    /**
     * Access method for regEvtBkngPrefUserCreated.
     *
     * @return the current value of regEvtBkngPrefUserCreated
     */
    public String getRegEvtBkngPrefUserCreated() {
        return regEvtBkngPrefUserCreated;
    }

    /**
     * Setter method for regEvtBkngPrefUserCreated.
     *
     * @param aRegEvtBkngPrefUserCreated the new value for regEvtBkngPrefUserCreated
     */
    public void setRegEvtBkngPrefUserCreated(String aRegEvtBkngPrefUserCreated) {
        regEvtBkngPrefUserCreated = aRegEvtBkngPrefUserCreated;
    }

    /**
     * Access method for regEvtBkngPrefDateCreated.
     *
     * @return the current value of regEvtBkngPrefDateCreated
     */
    public Timestamp getRegEvtBkngPrefDateCreated() {
        return regEvtBkngPrefDateCreated;
    }

    /**
     * Setter method for regEvtBkngPrefDateCreated.
     *
     * @param aRegEvtBkngPrefDateCreated the new value for regEvtBkngPrefDateCreated
     */
    public void setRegEvtBkngPrefDateCreated(Timestamp aRegEvtBkngPrefDateCreated) {
        regEvtBkngPrefDateCreated = aRegEvtBkngPrefDateCreated;
    }

    /**
     * Access method for regEvtBkngPrefUserModified.
     *
     * @return the current value of regEvtBkngPrefUserModified
     */
    public String getRegEvtBkngPrefUserModified() {
        return regEvtBkngPrefUserModified;
    }

    /**
     * Setter method for regEvtBkngPrefUserModified.
     *
     * @param aRegEvtBkngPrefUserModified the new value for regEvtBkngPrefUserModified
     */
    public void setRegEvtBkngPrefUserModified(String aRegEvtBkngPrefUserModified) {
        regEvtBkngPrefUserModified = aRegEvtBkngPrefUserModified;
    }

    /**
     * Access method for regEvtBkngPrefDateModified.
     *
     * @return the current value of regEvtBkngPrefDateModified
     */
    public Timestamp getRegEvtBkngPrefDateModified() {
        return regEvtBkngPrefDateModified;
    }

    /**
     * Setter method for regEvtBkngPrefDateModified.
     *
     * @param aRegEvtBkngPrefDateModified the new value for regEvtBkngPrefDateModified
     */
    public void setRegEvtBkngPrefDateModified(Timestamp aRegEvtBkngPrefDateModified) {
        regEvtBkngPrefDateModified = aRegEvtBkngPrefDateModified;
    }

    /**
     * Access method for preference1.
     *
     * @return the current value of preference1
     */
    public String getPreference1() {
        return preference1;
    }

    /**
     * Setter method for preference1.
     *
     * @param aPreference1 the new value for preference1
     */
    public void setPreference1(String aPreference1) {
        preference1 = aPreference1;
    }

    /**
     * Access method for preference2.
     *
     * @return the current value of preference2
     */
    public String getPreference2() {
        return preference2;
    }

    /**
     * Setter method for preference2.
     *
     * @param aPreference2 the new value for preference2
     */
    public void setPreference2(String aPreference2) {
        preference2 = aPreference2;
    }

    /**
     * Access method for preference3.
     *
     * @return the current value of preference3
     */
    public String getPreference3() {
        return preference3;
    }

    /**
     * Setter method for preference3.
     *
     * @param aPreference3 the new value for preference3
     */
    public void setPreference3(String aPreference3) {
        preference3 = aPreference3;
    }

    /**
     * Access method for preference4.
     *
     * @return the current value of preference4
     */
    public String getPreference4() {
        return preference4;
    }

    /**
     * Setter method for preference4.
     *
     * @param aPreference4 the new value for preference4
     */
    public void setPreference4(String aPreference4) {
        preference4 = aPreference4;
    }

    /**
     * Access method for preference5.
     *
     * @return the current value of preference5
     */
    public String getPreference5() {
        return preference5;
    }

    /**
     * Setter method for preference5.
     *
     * @param aPreference5 the new value for preference5
     */
    public void setPreference5(String aPreference5) {
        preference5 = aPreference5;
    }

    /**
     * Access method for voucherHeaderId.
     *
     * @return the current value of voucherHeaderId
     */
    public long getVoucherHeaderId() {
        return voucherHeaderId;
    }

    /**
     * Setter method for voucherHeaderId.
     *
     * @param aVoucherHeaderId the new value for voucherHeaderId
     */
    public void setVoucherHeaderId(long aVoucherHeaderId) {
        voucherHeaderId = aVoucherHeaderId;
    }

    /**
     * Access method for customerFirstname.
     *
     * @return the current value of customerFirstname
     */
    public String getCustomerFirstname() {
        return customerFirstname;
    }

    /**
     * Setter method for customerFirstname.
     *
     * @param aCustomerFirstname the new value for customerFirstname
     */
    public void setCustomerFirstname(String aCustomerFirstname) {
        customerFirstname = aCustomerFirstname;
    }

    /**
     * Access method for customerLastname.
     *
     * @return the current value of customerLastname
     */
    public String getCustomerLastname() {
        return customerLastname;
    }

    /**
     * Setter method for customerLastname.
     *
     * @param aCustomerLastname the new value for customerLastname
     */
    public void setCustomerLastname(String aCustomerLastname) {
        customerLastname = aCustomerLastname;
    }

    /**
     * Access method for voucherHeaderCustomerEmail.
     *
     * @return the current value of voucherHeaderCustomerEmail
     */
    public String getVoucherHeaderCustomerEmail() {
        return voucherHeaderCustomerEmail;
    }

    /**
     * Setter method for voucherHeaderCustomerEmail.
     *
     * @param aVoucherHeaderCustomerEmail the new value for voucherHeaderCustomerEmail
     */
    public void setVoucherHeaderCustomerEmail(String aVoucherHeaderCustomerEmail) {
        voucherHeaderCustomerEmail = aVoucherHeaderCustomerEmail;
    }

    /**
     * Access method for voucherSupplier.
     *
     * @return the current value of voucherSupplier
     */
    public String getVoucherSupplier() {
        return voucherSupplier;
    }

    /**
     * Setter method for voucherSupplier.
     *
     * @param aVoucherSupplier the new value for voucherSupplier
     */
    public void setVoucherSupplier(String aVoucherSupplier) {
        voucherSupplier = aVoucherSupplier;
    }

    /**
     * Access method for voucherHeaderTranTotalAmt.
     *
     * @return the current value of voucherHeaderTranTotalAmt
     */
    public BigDecimal getVoucherHeaderTranTotalAmt() {
        return voucherHeaderTranTotalAmt;
    }

    /**
     * Setter method for voucherHeaderTranTotalAmt.
     *
     * @param aVoucherHeaderTranTotalAmt the new value for voucherHeaderTranTotalAmt
     */
    public void setVoucherHeaderTranTotalAmt(BigDecimal aVoucherHeaderTranTotalAmt) {
        voucherHeaderTranTotalAmt = aVoucherHeaderTranTotalAmt;
    }

    /**
     * Access method for transAmountExcludingVat.
     *
     * @return the current value of transAmountExcludingVat
     */
    public BigDecimal getTransAmountExcludingVat() {
        return transAmountExcludingVat;
    }

    /**
     * Setter method for transAmountExcludingVat.
     *
     * @param aTransAmountExcludingVat the new value for transAmountExcludingVat
     */
    public void setTransAmountExcludingVat(BigDecimal aTransAmountExcludingVat) {
        transAmountExcludingVat = aTransAmountExcludingVat;
    }

    /**
     * Access method for transactionVoucherQuantity.
     *
     * @return the current value of transactionVoucherQuantity
     */
    public BigDecimal getTransactionVoucherQuantity() {
        return transactionVoucherQuantity;
    }

    /**
     * Setter method for transactionVoucherQuantity.
     *
     * @param aTransactionVoucherQuantity the new value for transactionVoucherQuantity
     */
    public void setTransactionVoucherQuantity(BigDecimal aTransactionVoucherQuantity) {
        transactionVoucherQuantity = aTransactionVoucherQuantity;
    }

    /**
     * Access method for transactionTicketQuantity.
     *
     * @return the current value of transactionTicketQuantity
     */
    public BigDecimal getTransactionTicketQuantity() {
        return transactionTicketQuantity;
    }

    /**
     * Setter method for transactionTicketQuantity.
     *
     * @param aTransactionTicketQuantity the new value for transactionTicketQuantity
     */
    public void setTransactionTicketQuantity(BigDecimal aTransactionTicketQuantity) {
        transactionTicketQuantity = aTransactionTicketQuantity;
    }

    /**
     * Access method for voucherHeaderUserCreated.
     *
     * @return the current value of voucherHeaderUserCreated
     */
    public String getVoucherHeaderUserCreated() {
        return voucherHeaderUserCreated;
    }

    /**
     * Setter method for voucherHeaderUserCreated.
     *
     * @param aVoucherHeaderUserCreated the new value for voucherHeaderUserCreated
     */
    public void setVoucherHeaderUserCreated(String aVoucherHeaderUserCreated) {
        voucherHeaderUserCreated = aVoucherHeaderUserCreated;
    }

    /**
     * Access method for voucherHeaderDateCreated.
     *
     * @return the current value of voucherHeaderDateCreated
     */
    public Timestamp getVoucherHeaderDateCreated() {
        return voucherHeaderDateCreated;
    }

    /**
     * Setter method for voucherHeaderDateCreated.
     *
     * @param aVoucherHeaderDateCreated the new value for voucherHeaderDateCreated
     */
    public void setVoucherHeaderDateCreated(Timestamp aVoucherHeaderDateCreated) {
        voucherHeaderDateCreated = aVoucherHeaderDateCreated;
    }

    /**
     * Access method for voucherHeaderUserModified.
     *
     * @return the current value of voucherHeaderUserModified
     */
    public String getVoucherHeaderUserModified() {
        return voucherHeaderUserModified;
    }

    /**
     * Setter method for voucherHeaderUserModified.
     *
     * @param aVoucherHeaderUserModified the new value for voucherHeaderUserModified
     */
    public void setVoucherHeaderUserModified(String aVoucherHeaderUserModified) {
        voucherHeaderUserModified = aVoucherHeaderUserModified;
    }

    /**
     * Access method for voucherHeaderDateModified.
     *
     * @return the current value of voucherHeaderDateModified
     */
    public Timestamp getVoucherHeaderDateModified() {
        return voucherHeaderDateModified;
    }

    /**
     * Setter method for voucherHeaderDateModified.
     *
     * @param aVoucherHeaderDateModified the new value for voucherHeaderDateModified
     */
    public void setVoucherHeaderDateModified(Timestamp aVoucherHeaderDateModified) {
        voucherHeaderDateModified = aVoucherHeaderDateModified;
    }

    /**
     * Access method for voucherHeaderTransactionPdfUrl.
     *
     * @return the current value of voucherHeaderTransactionPdfUrl
     */
    public String getVoucherHeaderTransactionPdfUrl() {
        return voucherHeaderTransactionPdfUrl;
    }

    /**
     * Setter method for voucherHeaderTransactionPdfUrl.
     *
     * @param aVoucherHeaderTransactionPdfUrl the new value for voucherHeaderTransactionPdfUrl
     */
    public void setVoucherHeaderTransactionPdfUrl(String aVoucherHeaderTransactionPdfUrl) {
        voucherHeaderTransactionPdfUrl = aVoucherHeaderTransactionPdfUrl;
    }

    /**
     * Access method for currencyTypeId.
     *
     * @return the current value of currencyTypeId
     */
    public BigDecimal getCurrencyTypeId() {
        return currencyTypeId;
    }

    /**
     * Setter method for currencyTypeId.
     *
     * @param aCurrencyTypeId the new value for currencyTypeId
     */
    public void setCurrencyTypeId(BigDecimal aCurrencyTypeId) {
        currencyTypeId = aCurrencyTypeId;
    }

    /**
     * Access method for voucherHeaderSourceOrderRef.
     *
     * @return the current value of voucherHeaderSourceOrderRef
     */
    public String getVoucherHeaderSourceOrderRef() {
        return voucherHeaderSourceOrderRef;
    }

    /**
     * Setter method for voucherHeaderSourceOrderRef.
     *
     * @param aVoucherHeaderSourceOrderRef the new value for voucherHeaderSourceOrderRef
     */
    public void setVoucherHeaderSourceOrderRef(String aVoucherHeaderSourceOrderRef) {
        voucherHeaderSourceOrderRef = aVoucherHeaderSourceOrderRef;
    }

    /**
     * Access method for voucherHeaderTransactionDate.
     *
     * @return the current value of voucherHeaderTransactionDate
     */
    public Timestamp getVoucherHeaderTransactionDate() {
        return voucherHeaderTransactionDate;
    }

    /**
     * Setter method for voucherHeaderTransactionDate.
     *
     * @param aVoucherHeaderTransactionDate the new value for voucherHeaderTransactionDate
     */
    public void setVoucherHeaderTransactionDate(Timestamp aVoucherHeaderTransactionDate) {
        voucherHeaderTransactionDate = aVoucherHeaderTransactionDate;
    }

    /**
     * Access method for membershipId.
     *
     * @return the current value of membershipId
     */
    public long getMembershipId() {
        return membershipId;
    }

    /**
     * Setter method for membershipId.
     *
     * @param aMembershipId the new value for membershipId
     */
    public void setMembershipId(long aMembershipId) {
        membershipId = aMembershipId;
    }

    /**
     * Access method for stageCreatedDate.
     *
     * @return the current value of stageCreatedDate
     */
    public Timestamp getStageCreatedDate() {
        return stageCreatedDate;
    }

    /**
     * Setter method for stageCreatedDate.
     *
     * @param aStageCreatedDate the new value for stageCreatedDate
     */
    public void setStageCreatedDate(Timestamp aStageCreatedDate) {
        stageCreatedDate = aStageCreatedDate;
    }

    /**
     * Access method for stageUpdatedDate.
     *
     * @return the current value of stageUpdatedDate
     */
    public Timestamp getStageUpdatedDate() {
        return stageUpdatedDate;
    }

    /**
     * Setter method for stageUpdatedDate.
     *
     * @param aStageUpdatedDate the new value for stageUpdatedDate
     */
    public void setStageUpdatedDate(Timestamp aStageUpdatedDate) {
        stageUpdatedDate = aStageUpdatedDate;
    }

    /**
     * Access method for stageCbEvntBkngLine.
     *
     * @return the current value of stageCbEvntBkngLine
     */
    public Set<StageCbEvntBkngLine> getStageCbEvntBkngLine() {
        return stageCbEvntBkngLine;
    }

    /**
     * Setter method for stageCbEvntBkngLine.
     *
     * @param aStageCbEvntBkngLine the new value for stageCbEvntBkngLine
     */
    public void setStageCbEvntBkngLine(Set<StageCbEvntBkngLine> aStageCbEvntBkngLine) {
        stageCbEvntBkngLine = aStageCbEvntBkngLine;
    }

    /**
     * Access method for stageMember.
     *
     * @return the current value of stageMember
     */
    public StageMember getStageMember() {
        return stageMember;
    }

    /**
     * Setter method for stageMember.
     *
     * @param aStageMember the new value for stageMember
     */
    public void setStageMember(StageMember aStageMember) {
        stageMember = aStageMember;
    }

    /**
     * Access method for stageOnsaleRegEvtBkngLine.
     *
     * @return the current value of stageOnsaleRegEvtBkngLine
     */
    public Set<StageOnsaleRegEvtBkngLine> getStageOnsaleRegEvtBkngLine() {
        return stageOnsaleRegEvtBkngLine;
    }

    /**
     * Setter method for stageOnsaleRegEvtBkngLine.
     *
     * @param aStageOnsaleRegEvtBkngLine the new value for stageOnsaleRegEvtBkngLine
     */
    public void setStageOnsaleRegEvtBkngLine(Set<StageOnsaleRegEvtBkngLine> aStageOnsaleRegEvtBkngLine) {
        stageOnsaleRegEvtBkngLine = aStageOnsaleRegEvtBkngLine;
    }

    /**
     * Access method for stageServiceActivity.
     *
     * @return the current value of stageServiceActivity
     */
    public Set<StageServiceActivity> getStageServiceActivity() {
        return stageServiceActivity;
    }

    /**
     * Setter method for stageServiceActivity.
     *
     * @param aStageServiceActivity the new value for stageServiceActivity
     */
    public void setStageServiceActivity(Set<StageServiceActivity> aStageServiceActivity) {
        stageServiceActivity = aStageServiceActivity;
    }

    /**
     * Access method for stageCommEvent.
     *
     * @return the current value of stageCommEvent
     */
    public Set<StageCommEvent> getStageCommEvent() {
        return stageCommEvent;
    }

    /**
     * Setter method for stageCommEvent.
     *
     * @param aStageCommEvent the new value for stageCommEvent
     */
    public void setStageCommEvent(Set<StageCommEvent> aStageCommEvent) {
        stageCommEvent = aStageCommEvent;
    }

    /**
     * Access method for stageVoucherDetail.
     *
     * @return the current value of stageVoucherDetail
     */
    public Set<StageVoucherDetail> getStageVoucherDetail() {
        return stageVoucherDetail;
    }

    /**
     * Setter method for stageVoucherDetail.
     *
     * @param aStageVoucherDetail the new value for stageVoucherDetail
     */
    public void setStageVoucherDetail(Set<StageVoucherDetail> aStageVoucherDetail) {
        stageVoucherDetail = aStageVoucherDetail;
    }

    /**
     * Compares the key for this instance with another StageServiceRequest.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageServiceRequest and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageServiceRequest)) {
            return false;
        }
        StageServiceRequest that = (StageServiceRequest) other;
        if (this.getRequestSysid() != that.getRequestSysid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageServiceRequest.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageServiceRequest)) return false;
        return this.equalKeys(other) && ((StageServiceRequest)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = (int)(getRequestSysid() ^ (getRequestSysid()>>>32));
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[StageServiceRequest |");
        sb.append(" requestSysid=").append(getRequestSysid());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("requestSysid", Long.valueOf(getRequestSysid()));
        return ret;
    }

}
