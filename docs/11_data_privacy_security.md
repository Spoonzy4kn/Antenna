# Data, Privacy, and Security

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This document defines Antenna's data handling, privacy posture, permission standards, and security rules.

Antenna is designed to be privacy-conscious by default. Data should be collected, stored, transmitted, or retained only where it provides clear user value or is required for implemented functionality.

---

## 2. Privacy baseline

Antenna shall not include by default:

- Application-owned advertising.
- Advertising SDKs.
- Telemetry.
- Analytics.
- Behavioural tracking.
- Unnecessary permissions.
- Unnecessary remote services.

If any diagnostic feature is later considered, it must be documented, justified, optional, opt-in, and user-controlled.

---

## 3. Expected local data

| Data | Required? | Storage | Notes |
| --- | --- | --- | --- |
| Local favourites / My Subs | Yes | Device local storage | Core anonymous personalisation feature. |
| Theme mode | Yes | Device local storage | System/light/dark where implemented. |
| NSFW visibility setting | Yes | Device local storage | Hidden/restricted by default. |
| NSFW age confirmation | Yes, if setting exists | Device local storage | Required before enabling NSFW visibility. |
| Cache | Optional | Device local storage | Should be bounded and clearable. |
| Recently viewed communities | Optional | Device local storage | Only if clearly useful. |
| Search history | Optional | Device local storage | Should be avoided unless justified and clearable. |
| Account tokens | Future only | Secure Android storage | Only if authentication is implemented. |

---

## 4. Data that must not be collected by default

Antenna must not collect by default:

- Analytics events.
- Usage telemetry.
- Advertising identifiers.
- Behavioural profiles.
- Cross-app tracking data.
- Unnecessary device identifiers.
- User contacts.
- Location.
- Files unrelated to app functionality.

---

## 5. Local favourites data contract

Local favourites should store the minimum required data:

```text
community_name: canonical name, e.g. "example"
display_name: display name, e.g. "r/example"
created_at: local timestamp
last_opened_at: optional local timestamp
```

Rules:

- Local favourites are local application data.
- Local favourites do not require account login.
- Local favourites are not platform-managed subscriptions.
- Local favourites should be removable by the user.
- Local favourites should not sync remotely unless a future explicit sync/export feature is implemented.

---

## 6. Permissions policy

Permissions should be requested only when required for implemented functionality.

Before adding a permission, document:

- Permission name.
- Feature requiring the permission.
- User-facing explanation.
- Behaviour if denied.
- Privacy impact.
- Whether it is required for Version 1.

Any new permission should trigger updates to Settings → Privacy and release notes.

---

## 7. Account security

Account features are not required for Version 1.

If added later, the project must define:

- Authentication method.
- Token storage.
- Token refresh.
- Logout behaviour.
- Account removal behaviour.
- Error handling for expired or revoked sessions.
- Tests for login and logout.
- Privacy disclosures.

Sensitive tokens must not be logged, committed, exported, or stored in plain text.

---

## 8. Logging policy

Production logs must not contain:

- Access tokens.
- Refresh tokens.
- Account identifiers beyond what is necessary.
- Private content.
- Search history.
- Full response payloads.
- Local favourites lists.
- Personal browsing history.

Development logging should remain careful and should avoid secrets.

---

## 9. Network and platform data

Antenna connects to a supported content platform to load content.

Network requests may reveal ordinary request information to the connected platform, such as content being requested, network metadata, and account information if authentication is later implemented.

Antenna should explain platform dependency and limitations clearly in Settings or documentation.

---

## 10. Threat model

| Threat | Impact | Mitigation |
| --- | --- | --- |
| Secrets committed to repository | Credential compromise. | `.gitignore`, review, no secrets in docs. |
| Sensitive data logged | Privacy breach. | Production logging restrictions. |
| Unnecessary tracking added later | Loss of user trust. | Privacy review and opt-in rule. |
| Excessive permissions | User privacy risk. | Permission justification process. |
| Cache grows without control | Storage bloat/privacy risk. | Bounded and clearable cache. |
| Platform restriction bypass attempt | Policy and reliability risk. | Use supported access methods only. |
| Ambiguous NSFW controls | Unwanted content exposure. | Hidden/restricted by default; age confirmation. |

---

## 11. Security and privacy release checklist

Before release:

- [ ] No secrets committed.
- [ ] No advertising SDKs added.
- [ ] No telemetry by default.
- [ ] No analytics by default.
- [ ] Permissions reviewed.
- [ ] Logs reviewed for sensitive data.
- [ ] Local data documented.
- [ ] Cache controls available if cache is implemented.
- [ ] NSFW setting behaviour verified.
- [ ] Account-required features clearly separated.

---

## 12. Summary

Antenna's privacy model is local-first and minimal by default. The application should collect less, store less, request fewer permissions, and explain its behaviour clearly.
