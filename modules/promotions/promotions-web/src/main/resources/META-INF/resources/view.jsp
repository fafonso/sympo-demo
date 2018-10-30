<%@ include file="/init.jsp" %>

<portlet:renderURL var="addPromotionURL">
	<portlet:param name="mvcRenderCommandName" value="/citytour/promotion/edit" />
	<portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>


<liferay-frontend:add-menu>
	<liferay-frontend:add-menu-item title="Promotion" url="${addPromotionURL}" />
</liferay-frontend:add-menu>

<div class="container-fluid-1280">
	<div class="flex-container">
		<liferay-ui:search-container emptyResultsMessage="promotion.no.promotions.available" emptyResultsMessageCssClass="taglib-empty-result-message-header-has-plus-btn">
			<liferay-ui:search-container-results results="${Promotions}" />
			<liferay-ui:search-container-row
				className="com.liferay.symposium.citytours.promotions.model.Promotion"
				modelVar="promotion">
				<portlet:renderURL var="editPromotionURL">
						<portlet:param name="mvcRenderCommandName"
							value="/citytour/promotion/edit" />
						<portlet:param name="redirect" value="${currentURL}" />
						<portlet:param name="promotionId" value="${promotion.getPromotionId()}" />
					</portlet:renderURL>

				<liferay-frontend:horizontal-card
                    text="${promotion.getDescription()} - ${promotion.getPrice()} euros"
                    actionJsp="/promotions/card_actions.jsp"
                    actionJspServletContext="<%= application %>" resultRow="<%=row %>"
                    url="${editPromotionURL}" cssClass="col-12">				  
					<liferay-frontend:horizontal-card-col>
						<clay:label label="${promotion.getUserName()}" style="info" />
					</liferay-frontend:horizontal-card-col>					
                </liferay-frontend:horizontal-card>

			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator markupView="lexicon" />
		</liferay-ui:search-container>
	</div>		
</div>