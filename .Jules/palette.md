## 2026-06-16 - Micro-UX and Bug Fixes in Legacy JSF
**Learning:** Legacy JSF applications often suffer from broken HTML-like tags (e.g., <h.form>), variable mismatches in data tables, and unescaped characters in JavaScript event handlers. Micro-UX improvements should be paired with these fundamental fixes to ensure the UI is actually functional.
**Action:** Always verify JSF component tags (use colons, not dots) and ensure EL expressions match the Java bean property names and method names exactly (case-sensitive).
