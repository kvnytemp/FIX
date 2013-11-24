/**
 * 
 */
package fix.bo;

import java.util.*;

/**
 * @author Kishore
 * 
 */
public class Fix35MsgTypes {

	private final static HashMap<String, String> MessageTypes = new HashMap<String, String>() {
		{
			put("0", "Heartbeat");
			put("1", "TestRequest");
			put("2", "ResendRequest");
			put("3", "Reject");
			put("4", "SequenceReset");
			put("5", "Logout");
			put("6", "IOI");
			put("7", "Advertisement");
			put("8", "ExecutionReport");
			put("9", "OrderCancelReject");
			put("A", "Logon");
			put("AA", "DerivativeSecurityList");
			put("AB", "NewOrderMultileg");
			put("AC", "MultilegOrderCancelReplace");
			put("AD", "TradeCaptureReportRequest");
			put("AE", "TradeCaptureReport");
			put("AF", "OrderMassStatusRequest");
			put("AG", "QuoteRequestReject");
			put("AH", "RFQRequest");
			put("AI", "QuoteStatusReport");
			put("AJ", "QuoteResponse");
			put("AK", "Confirmation");
			put("AL", "PositionMaintenanceRequest");
			put("AM", "PositionMaintenanceReport");
			put("AN", "RequestForPositions");
			put("AO", "RequestForPositionsAck");
			put("AP", "PositionReport");
			put("AQ", "TradeCaptureReportRequestAck");
			put("AR", "TradeCaptureReportAck");
			put("AS", "AllocationReport");
			put("AT", "AllocationReportAck");
			put("AU", "Confirmation_Ack");
			put("AV", "SettlementInstructionRequest");
			put("AW", "AssignmentReport");
			put("AX", "CollateralRequest");
			put("AY", "CollateralAssignment");
			put("AZ", "CollateralResponse");
			put("B", "News");
			put("BA", "CollateralReport");
			put("BB", "CollateralInquiry");
			put("BC", "NetworkCounterpartySystemStatusRequest");
			put("BD", "NetworkCounterpartySystemStatusResponse");
			put("BE", "UserRequest");
			put("BF", "UserResponse");
			put("BG", "CollateralInquiryAck");
			put("BH", "ConfirmationRequest");
			put("BI", "TradingSessionListRequest");
			put("BJ", "TradingSessionList");
			put("BK", "SecurityListUpdateReport");
			put("BL", "AdjustedPositionReport");
			put("BM", "AllocationInstructionAlert");
			put("BN", "ExecutionAcknowledgement");
			put("BO", "ContraryIntentionReport");
			put("BP", "SecurityDefinitionUpdateReport");
			put("BQ", "SettlementObligationReport");
			put("BR", "DerivativeSecurityListUpdateReport");
			put("BS", "TradingSessionListUpdateReport");
			put("BT", "MarketDefinitionRequest");
			put("BU", "MarketDefinition");
			put("BV", "MarketDefinitionUpdateReport");
			put("BW", "ApplicationMessageRequest");
			put("BX", "ApplicationMessageRequestAck");
			put("BY", "ApplicationMessageReport");
			put("BZ", "OrderMassActionReport");
			put("C", "Email");
			put("CA", "OrderMassActionRequest");
			put("CB", "UserNotification");
			put("CC", "StreamAssignmentRequest");
			put("CD", "StreamAssignmentReport");
			put("CE", "StreamAssignmentReportACK");
			put("CF", "PartyDetailsListRequest");
			put("CG", "PartyDetailsListReport");
			put("D", "NewOrderSingle");
			put("E", "NewOrderList");
			put("F", "OrderCancelRequest");
			put("G", "OrderCancelReplaceRequest");
			put("H", "OrderStatusRequest");
			put("J", "AllocationInstruction");
			put("K", "ListCancelRequest");
			put("L", "ListExecute");
			put("M", "ListStatusRequest");
			put("N", "ListStatus");
			put("P", "AllocationInstructionAck");
			put("Q", "DontKnowTradeDK");
			put("R", "QuoteRequest");
			put("S", "Quote");
			put("T", "SettlementInstructions");
			put("V", "MarketDataRequest");
			put("W", "MarketDataSnapshotFullRefresh");
			put("X", "MarketDataIncrementalRefresh");
			put("Y", "MarketDataRequestReject");
			put("Z", "QuoteCancel");
			put("a", "QuoteStatusRequest");
			put("b", "MassQuoteAcknowledgement");
			put("c", "SecurityDefinitionRequest");
			put("d", "SecurityDefinition");
			put("e", "SecurityStatusRequest");
			put("f", "SecurityStatus");
			put("g", "TradingSessionStatusRequest");
			put("h", "TradingSessionStatus");
			put("i", "MassQuote");
			put("j", "BusinessMessageReject");
			put("k", "BidRequest");
			put("l", "BidResponse");
			put("m", "ListStrikePrice");
			put("n", "XML_non_FIX");
			put("o", "RegistrationInstructions");
			put("p", "RegistrationInstructionsResponse");
			put("q", "OrderMassCancelRequest");
			put("r", "OrderMassCancelReport");
			put("s", "NewOrderCross");
			put("t", "CrossOrderCancelReplaceRequest");
			put("u", "CrossOrderCancelRequest");
			put("v", "SecurityTypeRequest");
			put("w", "SecurityTypes");
			put("x", "SecurityListRequest");
			put("y", "SecurityList");
			put("z", "DerivativeSecurityListRequest");
		}
	};
	
	public static String getMsgClassNameByType(String type) {
		String pkgNamePfx = "fix.bo.msgtypes.";
		String msgName = MessageTypes.get(type);
		// to do: if msgName is null throw exception
		
		return pkgNamePfx + msgName;
	}
}
