## 2026-06-04 - Handling Legacy JSF Files
**Learning:** Legacy projects often have inconsistent line endings (CRLF) and non-standard method naming (e.g., PascalCase for Java methods). JSF EL is case-sensitive for method expressions.
**Action:** Always normalize line endings using 'sed -i s/\r//' before patching and verify exact method names in Java source before updating 'action' attributes.
