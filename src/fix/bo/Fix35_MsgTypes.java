/**
 * 
 */
package fix.bo;

import java.util.*;

/**
 * @author Kishore
 * 
 */
public class Fix35_MsgTypes {

	private final static HashMap<String, String> MessageTypes = new HashMap<String, String>() {
		{
			put("0", "Msg_0_Heartbeat");
			put("1", "Msg_1_TestRequest");
			put("2", "Msg_2_ResendRequest");
			put("3", "Msg_3_Reject");
			put("4", "Msg_4_SequenceReset");
			put("5", "Msg_5_Logout");
			put("6", "Msg_6_IOI");
			put("7", "Msg_7_Advertisement");
			put("8", "Msg_8_ExecutionReport");
			put("9", "Msg_9_OrderCancelReject");
			put("A", "Msg_A_Logon");
			put("AA", "Msg_AA_DerivativeSecurityList");
			put("AB", "Msg_AB_NewOrderMultileg");
			put("AC", "Msg_AC_MultilegOrderCancelReplace");
			put("AD", "Msg_AD_TradeCaptureReportRequest");
			put("AE", "Msg_AE_TradeCaptureReport");
			put("AF", "Msg_AF_OrderMassStatusRequest");
			put("AG", "Msg_AG_QuoteRequestReject");
			put("AH", "Msg_AH_RFQRequest");
			put("AI", "Msg_AI_QuoteStatusReport");
			put("AJ", "Msg_AJ_QuoteResponse");
			put("AK", "Msg_AK_Confirmation");
			put("AL", "Msg_AL_PositionMaintenanceRequest");
			put("AM", "Msg_AM_PositionMaintenanceReport");
			put("AN", "Msg_AN_RequestForPositions");
			put("AO", "Msg_AO_RequestForPositionsAck");
			put("AP", "Msg_AP_PositionReport");
			put("AQ", "Msg_AQ_TradeCaptureReportRequestAck");
			put("AR", "Msg_AR_TradeCaptureReportAck");
			put("AS", "Msg_AS_AllocationReport");
			put("AT", "Msg_AT_AllocationReportAck");
			put("AU", "Msg_AU_Confirmation_Ack");
			put("AV", "Msg_AV_SettlementInstructionRequest");
			put("AW", "Msg_AW_AssignmentReport");
			put("AX", "Msg_AX_CollateralRequest");
			put("AY", "Msg_AY_CollateralAssignment");
			put("AZ", "Msg_AZ_CollateralResponse");
			put("B", "Msg_B_News");
			put("BA", "Msg_BA_CollateralReport");
			put("BB", "Msg_BB_CollateralInquiry");
			put("BC", "Msg_BC_NetworkCounterpartySystemStatusRequest");
			put("BD", "Msg_BD_NetworkCounterpartySystemStatusResponse");
			put("BE", "Msg_BE_UserRequest");
			put("BF", "Msg_BF_UserResponse");
			put("BG", "Msg_BGCollateralInquiryAck");
			put("BH", "Msg_BH_ConfirmationRequest");
			put("BI", "Msg_BI_TradingSessionListRequest");
			put("BJ", "Msg_BJ_TradingSessionList");
			put("BK", "Msg_BK_SecurityListUpdateReport");
			put("BL", "Msg_BL_AdjustedPositionReport");
			put("BM", "Msg_BM_AllocationInstructionAlert");
			put("BN", "Msg_BN_ExecutionAcknowledgement");
			put("BO", "Msg_BO_ContraryIntentionReport");
			put("BP", "Msg_BP_SecurityDefinitionUpdateReport");
			put("BQ", "Msg_BQ_SettlementObligationReport");
			put("BR", "Msg_BR_DerivativeSecurityListUpdateReport");
			put("BS", "Msg_BS_TradingSessionListUpdateReport");
			put("BT", "Msg_BT_MarketDefinitionRequest");
			put("BU", "Msg_BU_MarketDefinition");
			put("BV", "Msg_BV_MarketDefinitionUpdateReport");
			put("BW", "Msg_BW_ApplicationMessageRequest");
			put("BX", "Msg_BX_ApplicationMessageRequestAck");
			put("BY", "Msg_BY_ApplicationMessageReport");
			put("BZ", "Msg_BZ_OrderMassActionReport");
			put("C", "Msg_C_Email");
			put("CA", "Msg_CA_OrderMassActionRequest");
			put("CB", "Msg_CB_UserNotification");
			put("CC", "Msg_CC_StreamAssignmentRequest");
			put("CD", "Msg_CD_treamAssignmentReport");
			put("CE", "Msg_CE_StreamAssignmentReportACK");
			put("CF", "Msg_CF_PartyDetailsListRequest");
			put("CG", "Msg_CG_PartyDetailsListReport");
			put("D", "Msg_D_NewOrderSingle");
			put("E", "Msg_E_NewOrderList");
			put("F", "Msg_F_OrderCancelRequest");
			put("G", "Msg_G_OrderCancelReplaceRequest");
			put("H", "Msg_H_OrderStatusRequest");
			put("J", "Msg_J_AllocationInstruction");
			put("K", "Msg_K_ListCancelRequest");
			put("L", "Msg_L_ListExecute");
			put("M", "Msg_M_ListStatusRequest");
			put("N", "Msg_N_ListStatus");
			put("P", "Msg_P_AllocationInstructionAck");
			put("Q", "Msg_Q_DontKnowTradeDK");
			put("R", "Msg_R_uoteRequest");
			put("S", "Msg_S_Quote");
			put("T", "Msg_T_SettlementInstructions");
			put("V", "Msg_V_MarketDataRequest");
			put("W", "Msg_W_MarketDataSnapshotFullRefresh");
			put("X", "Msg_X_MarketDataIncrementalRefresh");
			put("Y", "Msg_Y_MarketDataRequestReject");
			put("Z", "Msg_Z_QuoteCancel");
			put("a", "Msg_a_QuoteStatusRequest");
			put("b", "Msg_b_MassQuoteAcknowledgement");
			put("c", "Msg_c_SecurityDefinitionRequest");
			put("d", "Msg_d_SecurityDefinition");
			put("e", "Msg_e_SecurityStatusRequest");
			put("f", "Msg_f_SecurityStatus");
			put("g", "Msg_g_TradingSessionStatusRequest");
			put("h", "Msg_h_TradingSessionStatus");
			put("i", "Msg_i_MassQuote");
			put("j", "Msg_j_BusinessMessageReject");
			put("k", "Msg_k_BidRequest");
			put("l", "Msg_l_BidResponse");
			put("m", "Msg_m_ListStrikePrice");
			put("n", "Msg_n_XML_non_FIX");
			put("o", "Msg_o_RegistrationInstructions");
			put("p", "Msg_p_RegistrationInstructionsResponse");
			put("q", "Msg_q_OrderMassCancelRequest");
			put("r", "Msg_r_OrderMassCancelReport");
			put("s", "Msg_s_NewOrderCross");
			put("t", "Msg_t_CrossOrderCancelReplaceRequest");
			put("u", "Msg_u_CrossOrderCancelRequest");
			put("v", "Msg_v_SecurityTypeRequest");
			put("w", "Msg_w_SecurityTypes");
			put("x", "Msg_x_SecurityListRequest");
			put("y", "Msg_y_SecurityList");
			put("z", "Msg_z_DerivativeSecurityListRequest");
			put("PARTY", "compblock.Party");
		}
	};
	
	public static String getMsgClassNameByType(String type) {
 		String pkgNamePfx = "fix.bo.msgtypes.";
		// String pkgNamePfx = "fix.bo.";
		String msgName = MessageTypes.get(type);
		// to do: if msgName is null throw exception
		
		return pkgNamePfx + msgName;
	}
}
