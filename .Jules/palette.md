## 2025-05-15 - Improving Accessibility and Code Quality in JSF
**Learning:** Legacy JSF applications often suffer from syntax errors (like nested forms or incorrect tag usage) and lack basic accessibility features such as ARIA labels for row actions and proper label-input associations.
**Action:** Always check for nested `<h:form>` tags, verify that iteration variables in `p:dataTable` are correctly referenced, and ensure all interactive elements have descriptive ARIA labels, especially when they are repeated for each row in a table.
