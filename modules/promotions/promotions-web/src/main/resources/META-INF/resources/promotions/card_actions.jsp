<%@ include file="../init.jsp"%>
<%
	ResultRow row = (ResultRow) request.getAttribute(
		WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	Promotion promotion = (Promotion) row.getObject();
	String promotionId =
		StringUtil.valueOf(promotion.getPromotionId());

%>

<liferay-ui:icon-menu markupView="lexicon" showWhenSingleIcon="true">
		<portlet:actionURL name="/citytour/promotion/delete"
			var="deletePromotionURL">
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="promotionId" value="${SEARCH_CONTAINER_RESULT_ROW.object.promotionId}" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="${deletePromotionURL}" label="promotion.delete"/>

</liferay-ui:icon-menu> 